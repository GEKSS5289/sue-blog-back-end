package com.sue.mapper;


import com.sue.basemapper.MyMapper;
import com.sue.model.entity.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends MyMapper<Article> {
}