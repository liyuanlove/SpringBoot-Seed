package com.coder.springbootdomecollection.model;

public class SysPermissionSearch extends SysPermission {

    private String orderBy;

    private String orderSequnce;

    private String where;

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderSequnce() {
        return orderSequnce;
    }

    public void setOrderSequnce(String orderSequnce) {
        this.orderSequnce = orderSequnce;
    }
}