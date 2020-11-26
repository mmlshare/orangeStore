package com.mmlshare.auth.controller;

import com.mmlshare.base.http.response.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin/roleManage")
@RestController
public class RoleManagerController {


    @RequestMapping("/query")
    public Response query() {
        return Response.createSuccessMsg("");
    }
}
