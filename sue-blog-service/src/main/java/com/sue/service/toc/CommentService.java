package com.sue.service.toc;

import com.sue.model.dto.CommentDTO;
import com.sue.model.vo.CommentVO;

import java.util.List;

/**
 * @author sue
 * @date 2020/11/13 19:43
 */

public interface CommentService {
    /**
     * 保存留言
     * @param commentDTO
     */
    void saveComment(CommentDTO commentDTO);

    /**
     * 通过ArticleId查找评论
     * @param articleId
     * @return
     */
    List<CommentVO> queryCommentByArticleId(Integer articleId);
}
