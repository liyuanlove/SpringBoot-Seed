package com.coder.springbootdomecollection.model;

import java.io.Serializable;

public class DoubleColorBallOrder implements Serializable {

    private static final long serialVersionUID = 2067721612681057570L;

    private Integer id;

    private Integer redball1;

    private Integer redball2;

    private Integer redball3;

    private Integer redball4;

    private Integer redball5;

    private Integer redball6;

    private Integer blueball;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRedball1() {
        return redball1;
    }

    public void setRedball1(Integer redball1) {
        this.redball1 = redball1;
    }

    public Integer getRedball2() {
        return redball2;
    }

    public void setRedball2(Integer redball2) {
        this.redball2 = redball2;
    }

    public Integer getRedball3() {
        return redball3;
    }

    public void setRedball3(Integer redball3) {
        this.redball3 = redball3;
    }

    public Integer getRedball4() {
        return redball4;
    }

    public void setRedball4(Integer redball4) {
        this.redball4 = redball4;
    }

    public Integer getRedball5() {
        return redball5;
    }

    public void setRedball5(Integer redball5) {
        this.redball5 = redball5;
    }

    public Integer getRedball6() {
        return redball6;
    }

    public void setRedball6(Integer redball6) {
        this.redball6 = redball6;
    }

    public Integer getBlueball() {
        return blueball;
    }

    public void setBlueball(Integer blueball) {
        this.blueball = blueball;
    }
}