package com.mmlshare.auth.repository;


import com.mmlshare.auth.beans.User;

public interface UserRepository {


    User findUserByUsername(String username);

    void addUser(User user);
}
