package com.mmlshare.auth.service.impl;

import com.mmlshare.auth.beans.User;
import com.mmlshare.auth.repository.UserRepository;
import com.mmlshare.auth.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerServiceImpl implements UserManagerService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {

        //保存用户
        userRepository.addUser(user);

        return user;
    }
}
