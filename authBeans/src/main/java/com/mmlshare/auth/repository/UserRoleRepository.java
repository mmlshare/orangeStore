package com.mmlshare.auth.repository;


import com.mmlshare.auth.beans.UserRole;

import java.util.List;

public interface UserRoleRepository{

    List<UserRole> findUserRolesByUsername(String username);
}
