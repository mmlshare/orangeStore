package com.mmlshare.auth.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 角色
 */

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(length = 30, name = "id")
    private String id;
    @Column(length = 30, name = "name")
    private String name;

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
