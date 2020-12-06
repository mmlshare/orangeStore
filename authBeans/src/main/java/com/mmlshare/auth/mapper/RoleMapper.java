package com.mmlshare.auth.mapper;


import com.mmlshare.auth.beans.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    Role selectByRoleId(String roleId);

}
