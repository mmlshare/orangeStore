package com.mmlshare.auth.repository.impl;

import com.mmlshare.auth.beans.Role;
import com.mmlshare.auth.mapper.RoleMapper;
import com.mmlshare.auth.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public Role findRoleByRoleId(String roleId) {
        return roleMapper.selectByRoleId(roleId);
    }
}
