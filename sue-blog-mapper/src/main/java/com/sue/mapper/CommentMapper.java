package com.sue.mapper;


import com.sue.basemapper.MyMapper;
import com.sue.model.entity.Comment;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentMapper extends MyMapper<Comment> {
}