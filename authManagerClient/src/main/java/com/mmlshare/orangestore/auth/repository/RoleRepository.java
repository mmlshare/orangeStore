package com.mmlshare.orangestore.auth.repository;


import com.mmlshare.auth.beans.Role;

import java.util.List;

public interface RoleRepository {
    void addRole(Role role);

    void removeById(String id);

    List<Role> findUserRole(String username);
}
