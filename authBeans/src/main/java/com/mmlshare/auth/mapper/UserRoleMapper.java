package com.mmlshare.auth.mapper;

import com.mmlshare.auth.beans.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    List<UserRole> selectByUsername(String username);
}
