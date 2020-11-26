package com.mmlshare.auth.service;

import com.mmlshare.auth.beans.User;

public interface UserManagerService {
    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    User registerUser(User user);
}
