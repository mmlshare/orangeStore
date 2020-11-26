package com.mmlshare.auth.beans.wrapper;

import com.mmlshare.auth.beans.Role;
import com.mmlshare.auth.beans.User;

import java.util.List;

public class WrapperUser extends User {
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
