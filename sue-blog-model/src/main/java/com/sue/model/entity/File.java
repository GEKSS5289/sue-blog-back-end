package com.sue.model.entity;

import com.sue.model.vo.FileVO;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class File {
    /**
     * 文件Id
     */
    @Id
    private Integer id;

    /**
     * 文件路径
     */
    @Column(name = "file_path")
    private String filePath;

    /**
     * 文件名
     */
    @Column(name = "file_name")
    private String fileName;

    /**
     * 文件发布者
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 文件大小
     */
    @Column(name = "file_size")
    private Long fileSize;

    /**
     * 文件是否可提供下载 (0不可以 1可以)
     */
    @Column(name = "file_usable")
    private Boolean fileUsable;

    /**
     * 文件上传时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 文件更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;



    public FileVO toFileVO(){
        return new FileVO(this);
    }

    /**
     * 获取文件Id
     *
     * @return id - 文件Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置文件Id
     *
     * @param id 文件Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取文件路径
     *
     * @return file_path - 文件路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置文件路径
     *
     * @param filePath 文件路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取文件名
     *
     * @return file_name - 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名
     *
     * @param fileName 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取文件发布者
     *
     * @return user_id - 文件发布者
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置文件发布者
     *
     * @param userId 文件发布者
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取文件大小
     *
     * @return file_size - 文件大小
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * 设置文件大小
     *
     * @param fileSize 文件大小
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * 获取文件是否可提供下载 (0不可以 1可以)
     *
     * @return file_usable - 文件是否可提供下载 (0不可以 1可以)
     */
    public Boolean getFileUsable() {
        return fileUsable;
    }

    /**
     * 设置文件是否可提供下载 (0不可以 1可以)
     *
     * @param fileUsable 文件是否可提供下载 (0不可以 1可以)
     */
    public void setFileUsable(Boolean fileUsable) {
        this.fileUsable = fileUsable;
    }

    /**
     * 获取文件上传时间
     *
     * @return created_time - 文件上传时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置文件上传时间
     *
     * @param createdTime 文件上传时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取文件更新时间
     *
     * @return updated_time - 文件更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置文件更新时间
     *
     * @param updatedTime 文件更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}