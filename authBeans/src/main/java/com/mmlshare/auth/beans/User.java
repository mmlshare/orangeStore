package com.mmlshare.auth.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;

import java.util.List;

@TypeAlias("user")
public class User {
    @Id
    private String username;
    private String password;

    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
