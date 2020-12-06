package com.mmlshare.auth.repository.impl;

import com.mmlshare.auth.beans.UserRole;
import com.mmlshare.auth.mapper.UserRoleMapper;
import com.mmlshare.auth.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRoleRepositoryImpl implements UserRoleRepository {
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> findUserRolesByUsername(String username) {
        return userRoleMapper.selectByUsername(username);
    }
}
