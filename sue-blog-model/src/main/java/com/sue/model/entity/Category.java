package com.sue.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Category {
    /**
     * 分类ID
     */
    @Id
    private Integer id;

    /**
     * 分类名字
     */
    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_img")
    private String categoryImg;

    /**
     * 获取分类ID
     *
     * @return id - 分类ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置分类ID
     *
     * @param id 分类ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名字
     *
     * @return category_name - 分类名字
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置分类名字
     *
     * @param categoryName 分类名字
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return category_img
     */
    public String getCategoryImg() {
        return categoryImg;
    }

    /**
     * @param categoryImg
     */
    public void setCategoryImg(String categoryImg) {
        this.categoryImg = categoryImg;
    }
}