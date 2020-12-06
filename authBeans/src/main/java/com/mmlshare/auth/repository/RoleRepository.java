package com.mmlshare.auth.repository;


import com.mmlshare.auth.beans.Role;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RoleRepository{

    Role findRoleByRoleId(String roleId);
}
