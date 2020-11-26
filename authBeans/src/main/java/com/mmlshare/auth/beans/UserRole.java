package com.mmlshare.auth.beans;

import javax.persistence.*;

/**
 * 用户 权限关系表
 */
@Entity
@Table(name = "user_role")
public class UserRole {

    @Column(length = 30, name = "username")
    private String username;
    @Column(length = 30, name = "role_id")
    private String roleId;
    @Column(length = 30, name = "role_name")
    private String roleName;
    @Id
    @GeneratedValue
    private String id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
