package com.coder.springbootdomecollection.model;

import java.util.Date;

public class DoubleColorBallKey {
    private Integer id;

    private String redball1;

    private String redball2;

    private String redball4;

    private String redball3;

    private String redball5;

    private String redball6;

    private String buleball;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRedball1() {
        return redball1;
    }

    public void setRedball1(String redball1) {
        this.redball1 = redball1 == null ? null : redball1.trim();
    }

    public String getRedball2() {
        return redball2;
    }

    public void setRedball2(String redball2) {
        this.redball2 = redball2 == null ? null : redball2.trim();
    }

    public String getRedball4() {
        return redball4;
    }

    public void setRedball4(String redball4) {
        this.redball4 = redball4 == null ? null : redball4.trim();
    }

    public String getRedball3() {
        return redball3;
    }

    public void setRedball3(String redball3) {
        this.redball3 = redball3 == null ? null : redball3.trim();
    }

    public String getRedball5() {
        return redball5;
    }

    public void setRedball5(String redball5) {
        this.redball5 = redball5 == null ? null : redball5.trim();
    }

    public String getRedball6() {
        return redball6;
    }

    public void setRedball6(String redball6) {
        this.redball6 = redball6 == null ? null : redball6.trim();
    }

    public String getBuleball() {
        return buleball;
    }

    public void setBuleball(String buleball) {
        this.buleball = buleball == null ? null : buleball.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}