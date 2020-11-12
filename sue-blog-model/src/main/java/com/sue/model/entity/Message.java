package com.sue.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Message {
    /**
     * 留言ID
     */
    @Id
    private Integer id;

    /**
     * 留言是否可见
     */
    @Column(name = "is_show")
    private Boolean isShow;

    /**
     * 留言内容
     */
    private String content;

    /**
     * 留言时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 留言删除时间
     */
    @Column(name = "deleted_time")
    private Date deletedTime;

    /**
     * 获取留言ID
     *
     * @return id - 留言ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置留言ID
     *
     * @param id 留言ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取留言是否可见
     *
     * @return is_show - 留言是否可见
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * 设置留言是否可见
     *
     * @param isShow 留言是否可见
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取留言内容
     *
     * @return content - 留言内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置留言内容
     *
     * @param content 留言内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取留言时间
     *
     * @return created_time - 留言时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置留言时间
     *
     * @param createdTime 留言时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取留言删除时间
     *
     * @return deleted_time - 留言删除时间
     */
    public Date getDeletedTime() {
        return deletedTime;
    }

    /**
     * 设置留言删除时间
     *
     * @param deletedTime 留言删除时间
     */
    public void setDeletedTime(Date deletedTime) {
        this.deletedTime = deletedTime;
    }
}