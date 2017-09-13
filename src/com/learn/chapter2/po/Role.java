package com.learn.chapter2.po;

/**
 * Created by chl1327 on 2017/7/16.
 */

public class Role {

    private Long id;
    private String roleName;
    private String note;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
