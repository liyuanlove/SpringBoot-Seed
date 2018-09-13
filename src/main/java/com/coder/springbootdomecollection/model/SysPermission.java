package com.coder.springbootdomecollection.model;


import java.io.Serializable;

public class SysPermission extends BaseModel implements Serializable {

    private static final long serialVersionUID = -7227270792179132899L;

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}