package com.mmlshare.orangestore.auth.repository;

import com.mmlshare.orangestore.auth.pojo.User;

public interface UserRepository {
    void addUser(User user);

    User findUserByUsername(String username);

    void modifyUser(User user);

    void deleteByUsername(String username);
}
