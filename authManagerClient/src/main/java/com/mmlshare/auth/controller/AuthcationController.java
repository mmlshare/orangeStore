package com.mmlshare.auth.controller;

import com.mmlshare.base.http.response.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthcationController {

    @RequestMapping("/")
    public Response loginSuccess() {
        return Response.createSuccessMsg("登陆成功");
    }

    @RequestMapping("/loginPage")
    public Response loginPage() {
        return Response.createLoginMsg("未登陆，请登陆");
    }

    @RequestMapping("/refresh")
    public Response refresh() {
        return Response.createSuccessMsg("refresh");
    }

}
