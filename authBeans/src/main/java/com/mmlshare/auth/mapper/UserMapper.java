package com.mmlshare.auth.mapper;

import com.mmlshare.auth.beans.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectByUsername(String username);

    void insert(User user);
}
