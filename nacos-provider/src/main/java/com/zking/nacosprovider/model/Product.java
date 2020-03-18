package com.zking.nacosprovider.model;

public class Product {
    private String id;

    private String title;

    private Integer rangelimit;

    private Integer pdate;

    private String remark;

    private Float interest;

    public Product(String id, String title, Integer rangelimit, Integer pdate, String remark, Float interest) {
        this.id = id;
        this.title = title;
        this.rangelimit = rangelimit;
        this.pdate = pdate;
        this.remark = remark;
        this.interest = interest;
    }

    public Product() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRangelimit() {
        return rangelimit;
    }

    public void setRangelimit(Integer rangelimit) {
        this.rangelimit = rangelimit;
    }

    public Integer getPdate() {
        return pdate;
    }

    public void setPdate(Integer pdate) {
        this.pdate = pdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        this.interest = interest;
    }
}