package com.mmlshare.auth.service.impl;


import com.mmlshare.auth.beans.User;
import com.mmlshare.auth.beans.UserRole;
import com.mmlshare.auth.repository.UserRepository;
import com.mmlshare.auth.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("authUserDetailService")
public class AuthUserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();

        User user = userRepository.findUserByUsername(username);

        if (user == null) {
            throw new BadCredentialsException("用户名不存在");
        }

        List<UserRole> roleList = userRoleRepository.findUserRolesByUsername(username);

        if (CollectionUtils.isEmpty(roleList)) {
            throw new BadCredentialsException("权限不足");
        }

        for (UserRole role : roleList) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        // 返回UserDetails实现类
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }
}
