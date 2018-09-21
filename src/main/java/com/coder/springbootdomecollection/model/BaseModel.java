package com.coder.springbootdomecollection.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class BaseModel implements Serializable {

    private static final long serialVersionUID = -2921870919538436571L;

    @JSONField(serialize=false)
    private String orderBy;

    @JSONField(serialize=false)
    private String orderSequnce;

    @JSONField(serialize=false)
    private String where;

    private Boolean show = false;

    public Boolean getShow(){
        return this.show;
    }

    public void setShow(Boolean show){
        this.show = show;
    }

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
