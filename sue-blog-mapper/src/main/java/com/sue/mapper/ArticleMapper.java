package com.sue.mapper;


import com.sue.basemapper.MyMapper;
import com.sue.model.entity.Article;
import com.sue.model.vo.toc.ArticleDescVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper extends MyMapper<Article> {
    List<ArticleDescVO> queryArticleDesc();
}