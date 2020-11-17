package com.mmlshare.orangestore.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthcationController {
    @RequestMapping("/")
    public String login() {
        return "login";
    }


}
