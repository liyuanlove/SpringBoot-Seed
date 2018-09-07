package com.coder.springbootdomecollection.model;

public class Page {

    public Page(){
        this.pageIndex = 0;
        this.pageSize = 20;
    }

    public Page(int pageIndex,int pageSize){
        pageIndex = pageIndex - 1;
        if(pageIndex < 0) {
            pageIndex = 1;
        }
        this.pageIndex = pageIndex;
        if(pageSize < 0){
            pageSize = 20;
        }
        this.pageSize = pageSize;
    }

    private Integer pageIndex;
    private Integer pageSize;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
