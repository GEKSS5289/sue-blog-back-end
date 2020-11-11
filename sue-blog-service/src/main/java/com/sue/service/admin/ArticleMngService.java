package com.sue.service.admin;

import com.sue.model.dto.ArticleDTO;
import com.sue.model.entity.Dynamic;
import com.sue.model.vo.admin.ArticleMngDescVO;
import com.sue.model.vo.toc.ArticleContentVO;

import java.util.List;

/**
 * @author sue
 * @date 2020/10/31 18:09
 */

public interface ArticleMngService {
     void saveArticle(ArticleDTO articleDTO);
     List<ArticleMngDescVO> queryArticleDescList();
     void deleteArticle(Integer articleId);
     ArticleContentVO queryArticleContent(Integer articleId);
     void updateArticleContent(Integer articleId,ArticleDTO articleDTO);
}
