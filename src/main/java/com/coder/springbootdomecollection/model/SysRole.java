package com.coder.springbootdomecollection.model;

import java.io.Serializable;
import java.util.List;

public class SysRole implements Serializable {

    private static final long serialVersionUID = 1711078445252107437L;
    private Integer rid;

    private String rname;

    private List<SysPermission> sysPermissionList;

    public List<SysPermission> getSysPermissionList() {
        return sysPermissionList;
    }

    public void setSysPermissionList(List<SysPermission> sysPermissionList) {
        this.sysPermissionList = sysPermissionList;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }
}