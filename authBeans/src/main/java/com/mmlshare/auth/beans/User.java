package com.mmlshare.auth.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(length = 30, name = "username")
    private String username;
    @Column(length = 30, name = "password")
    private String password;


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
