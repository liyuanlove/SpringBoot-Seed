package com.coder.springbootdomecollection.model;

public class DoubleColorBallSearch {

    private String orderBy;
    private String orderSequnce;
    private Integer pageIndex;
    private Integer pageSize;

    public DoubleColorBallSearch(){}

    public DoubleColorBallSearch(Page page){
        this.pageIndex = page.getPageIndex();
        this.pageSize = page.getPageSize();
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