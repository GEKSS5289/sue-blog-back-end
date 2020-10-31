package com.sue.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Article {
    /**
     * 文章id
     */
    @Id
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 文章更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 文章删除时间
     */
    @Column(name = "delete_time")
    private Date deleteTime;

    /**
     * 文章是否显示
     */
    @Column(name = "is_show")
    private Integer isShow;

    /**
     * 文章分类id
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 作者id
     */
    @Column(name = "author_id")
    private Integer authorId;

    /**
     * 文章评论总数
     */
    @Column(name = "comment_counts")
    private Integer commentCounts;

    /**
     * 获取文章id
     *
     * @return id - 文章id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置文章id
     *
     * @param id 文章id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取文章标题
     *
     * @return title - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取文章内容
     *
     * @return content - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取文章创建时间
     *
     * @return created_time - 文章创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置文章创建时间
     *
     * @param createdTime 文章创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取文章更新时间
     *
     * @return update_time - 文章更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置文章更新时间
     *
     * @param updateTime 文章更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取文章删除时间
     *
     * @return delete_time - 文章删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置文章删除时间
     *
     * @param deleteTime 文章删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取文章是否显示
     *
     * @return is_show - 文章是否显示
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置文章是否显示
     *
     * @param isShow 文章是否显示
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取文章分类id
     *
     * @return category_id - 文章分类id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置文章分类id
     *
     * @param categoryId 文章分类id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取作者id
     *
     * @return author_id - 作者id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 设置作者id
     *
     * @param authorId 作者id
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * 获取文章评论总数
     *
     * @return comment_counts - 文章评论总数
     */
    public Integer getCommentCounts() {
        return commentCounts;
    }

    /**
     * 设置文章评论总数
     *
     * @param commentCounts 文章评论总数
     */
    public void setCommentCounts(Integer commentCounts) {
        this.commentCounts = commentCounts;
    }
}