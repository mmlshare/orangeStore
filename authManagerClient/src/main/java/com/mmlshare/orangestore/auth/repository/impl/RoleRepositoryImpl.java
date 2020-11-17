package com.mmlshare.orangestore.auth.repository.impl;

import com.mmlshare.orangestore.auth.pojo.Role;
import com.mmlshare.orangestore.auth.repository.RoleRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roleRepository")
public class RoleRepositoryImpl implements RoleRepository {
    @Override
    public void addRole(Role role) {

    }

    @Override
    public void removeById(String id) {

    }

    @Override
    public List<Role> findUserRole(String username) {
        return null;
    }
}
