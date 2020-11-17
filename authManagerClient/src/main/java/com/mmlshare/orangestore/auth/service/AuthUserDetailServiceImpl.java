package com.mmlshare.orangestore.auth.service;

import com.mmlshare.orangestore.auth.pojo.Role;
import com.mmlshare.orangestore.auth.pojo.User;
import com.mmlshare.orangestore.auth.repository.RoleRepository;
import com.mmlshare.orangestore.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service("authUserDetailService")
public class AuthUserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    public void init() {
        User user = new User();
        user.setUsername("123");
        user.setPassword("123");
        Role role = new Role();
        role.setName("ADMIN");
        user.setRoleList(Arrays.asList(role));
        userRepository.addUser(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();


        User user = userRepository.findUserByUsername(username);


        if (user == null) {
            throw new BadCredentialsException("用户名不存在");
        }

        List<Role> roleList = roleRepository.findUserRole(username);

        if (CollectionUtils.isEmpty(roleList)) {
            throw new BadCredentialsException("权限不足");
        }

        for (Role role : roleList) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        // 返回UserDetails实现类
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }
}
