package com.sue.service.impl.toc;

import com.sue.common.enums.ExistEnums;
import com.sue.common.enums.ShowOrHide;
import com.sue.mapper.CommentMapper;
import com.sue.model.dto.CommentDTO;
import com.sue.model.entity.Comment;
import com.sue.model.vo.CommentVO;
import com.sue.service.toc.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sue
 * @date 2020/11/13 19:43
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveComment(CommentDTO commentDTO) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO,comment);
        comment.setDel(false);
        comment.setCreatedTime(new Date());
        comment.setUpdatedTime(new Date());
        commentMapper.insert(comment);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<CommentVO> queryCommentByArticleId(Integer articleId) {

        Example example = new Example(Comment.class);
        example.orderBy("createdTime").desc();
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("articleId",articleId);
        criteria.andEqualTo("isDel", ExistEnums.NOT_DEL.getCode());

        List<Comment> comments = commentMapper.selectByExample(example);
        List<CommentVO> collect = comments
                .stream()
                .map(Comment::toCommentVO)
                .collect(Collectors.toList());

        return collect;
    }


}
