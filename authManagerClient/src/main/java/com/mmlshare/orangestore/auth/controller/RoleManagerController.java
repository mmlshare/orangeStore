package com.mmlshare.orangestore.auth.controller;

import com.mmlshare.orangestore.http.Response;
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
