package com.coder.springbootdomecollection.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SysUser extends BaseModel implements Serializable {

    private static final long serialVersionUID = 5062460457521507872L;

    private Integer id;

    private String name;

    private String password;

    private String phone;

    private Integer sex;

    private Date gmtCreate;

    private Date gmtModified;

    private List<SysRole> roleList;

    private List<SysMenu> menuList;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<SysMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<SysMenu> menuList) {
        this.menuList = menuList;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", roleList=" + roleList +
                ", menuList=" + menuList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SysUser)){
            return false;
        }
        SysUser sysUser = (SysUser) o;
        return Objects.equals(getId(), sysUser.getId()) &&
                Objects.equals(getName(), sysUser.getName()) &&
                Objects.equals(getPassword(), sysUser.getPassword()) &&
                Objects.equals(getPhone(), sysUser.getPhone()) &&
                Objects.equals(getSex(), sysUser.getSex()) &&
                Objects.equals(getGmtCreate(), sysUser.getGmtCreate()) &&
                Objects.equals(getGmtModified(), sysUser.getGmtModified()) &&
                Objects.equals(getRoleList(), sysUser.getRoleList()) &&
                Objects.equals(getMenuList(), sysUser.getMenuList());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getPassword(), getPhone(), getSex(), getGmtCreate(), getGmtModified(), getRoleList(), getMenuList());
    }
}