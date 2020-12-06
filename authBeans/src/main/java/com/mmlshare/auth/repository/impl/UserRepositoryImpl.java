package com.mmlshare.auth.repository.impl;

import com.mmlshare.auth.beans.User;
import com.mmlshare.auth.mapper.UserMapper;
import com.mmlshare.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class  UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }
}
