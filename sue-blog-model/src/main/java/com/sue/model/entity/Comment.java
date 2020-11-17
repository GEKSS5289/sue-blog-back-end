package com.sue.model.entity;

import com.sue.model.vo.CommentVO;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Comment {
    /**
     * 评论ID
     */
    @Id
    private Integer id;

    /**
     * 评论删除状态(0:删除)
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * 评论的文章id
     */
    @Column(name = "article_id")
    private Integer articleId;

    /**
     * 评论内容
     */
    @Column(name = "comment_content")
    private String commentContent;

    /**
     * 评论时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;


    public CommentVO toCommentVO(){
        return new CommentVO(this);
    }
    /**
     * 获取评论ID
     *
     * @return id - 评论ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置评论ID
     *
     * @param id 评论ID
     */
    public void setId(Integer id) {
        this.id = id;
    }


    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    /**
     * 获取评论的文章id
     *
     * @return article_id - 评论的文章id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 设置评论的文章id
     *
     * @param articleId 评论的文章id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取评论内容
     *
     * @return comment_content - 评论内容
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * 设置评论内容
     *
     * @param commentContent 评论内容
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    /**
     * 获取评论时间
     *
     * @return created_time - 评论时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置评论时间
     *
     * @param createdTime 评论时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}