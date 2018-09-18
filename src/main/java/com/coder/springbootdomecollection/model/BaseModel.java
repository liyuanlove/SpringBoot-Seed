package com.coder.springbootdomecollection.model;

import com.alibaba.fastjson.annotation.JSONField;

public class BaseModel {

    @JSONField(serialize=false)
    private String orderBy;

    @JSONField(serialize=false)
    private String orderSequnce;

    @JSONField(serialize=false)
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
