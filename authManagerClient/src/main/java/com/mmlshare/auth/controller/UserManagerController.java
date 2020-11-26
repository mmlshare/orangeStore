package com.mmlshare.auth.controller;

import com.mmlshare.auth.beans.User;
import com.mmlshare.auth.repository.UserRepository;
import com.mmlshare.auth.repository.UserRoleRepository;
import com.mmlshare.auth.service.UserManagerService;
import com.mmlshare.base.beans.exception.CustomerRuntimeException;
import com.mmlshare.base.http.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserManagerController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserManagerService userManagerService;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @RequestMapping("/register")
    public Response register(User user) {
        checkUser(user);
        User temUser = userManagerService.registerUser(user);
        return Response.createSuccessMsgWithData("注册成功", temUser);
    }

    private void checkUser(User user) {
        checkUserProperties(user);

        checkUserIsExisted(user);
    }

    private void checkUserIsExisted(User user) {
        User temUser = userRepository.findUserByUsername(user.getUsername());
        if (temUser != null) {
            throw new CustomerRuntimeException("用户名 " + user.getUsername() + " 已存在");
        }
    }

    private void checkUserProperties(User user) {
        if (!StringUtils.hasText(user.getUsername())) {
            throw new CustomerRuntimeException("用户名不能为空");
        }
        if (!StringUtils.hasText(user.getPassword())) {
            throw new CustomerRuntimeException("密码不能为空");
        }
    }


}
