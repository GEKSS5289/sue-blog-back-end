package com.sue.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Dynamic {
    /**
     * 动态id
     */
    @Id
    private Integer id;

    /**
     * 动态内容
     */
    private String content;

    /**
     * 动态内容里的图片
     */
    @Column(name = "dy_img")
    private String dyImg;

    /**
     * 动态内容里的视频
     */
    @Column(name = "dy_video")
    private String dyVideo;

    /**
     * 动态是否显示
     */
    @Column(name = "is_show")
    private Boolean isShow;

    /**
     * 发布动态的用户id
     */
    private Integer uid;

    /**
     * 发送动态时的心情
     */
    private String mood;

    /**
     * 动态创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 动态更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 动态删除时间
     */
    @Column(name = "deleted_time")
    private Date deletedTime;

    /**
     * 获取动态id
     *
     * @return id - 动态id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置动态id
     *
     * @param id 动态id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取动态内容
     *
     * @return content - 动态内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置动态内容
     *
     * @param content 动态内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取动态内容里的图片
     *
     * @return dy_img - 动态内容里的图片
     */
    public String getDyImg() {
        return dyImg;
    }

    /**
     * 设置动态内容里的图片
     *
     * @param dyImg 动态内容里的图片
     */
    public void setDyImg(String dyImg) {
        this.dyImg = dyImg;
    }

    /**
     * 获取动态内容里的视频
     *
     * @return dy_video - 动态内容里的视频
     */
    public String getDyVideo() {
        return dyVideo;
    }

    /**
     * 设置动态内容里的视频
     *
     * @param dyVideo 动态内容里的视频
     */
    public void setDyVideo(String dyVideo) {
        this.dyVideo = dyVideo;
    }

    /**
     * 获取动态是否显示
     *
     * @return is_show - 动态是否显示
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * 设置动态是否显示
     *
     * @param isShow 动态是否显示
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取发布动态的用户id
     *
     * @return uid - 发布动态的用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置发布动态的用户id
     *
     * @param uid 发布动态的用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取发送动态时的心情
     *
     * @return mood - 发送动态时的心情
     */
    public String getMood() {
        return mood;
    }

    /**
     * 设置发送动态时的心情
     *
     * @param mood 发送动态时的心情
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * 获取动态创建时间
     *
     * @return created_time - 动态创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置动态创建时间
     *
     * @param createdTime 动态创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取动态更新时间
     *
     * @return updated_time - 动态更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置动态更新时间
     *
     * @param updatedTime 动态更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取动态删除时间
     *
     * @return deleted_time - 动态删除时间
     */
    public Date getDeletedTime() {
        return deletedTime;
    }

    /**
     * 设置动态删除时间
     *
     * @param deletedTime 动态删除时间
     */
    public void setDeletedTime(Date deletedTime) {
        this.deletedTime = deletedTime;
    }
}