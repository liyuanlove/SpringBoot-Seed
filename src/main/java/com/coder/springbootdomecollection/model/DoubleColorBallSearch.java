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


    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        pageIndex = pageIndex - 1;
        if(pageIndex < 0) {
            pageIndex = 1;
        }
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize < 0){
            pageSize = 20;
        }
        this.pageSize = pageSize;
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