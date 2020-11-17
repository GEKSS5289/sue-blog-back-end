package com.sue.service.toc;

import com.sue.model.vo.ArticleContentVO;
import com.sue.model.vo.ArticleDescVO;

import java.util.List;

/**
 * @author sue
 * @date 2020/10/31 19:33
 */

public interface ArticleService {

    List<ArticleDescVO> queryArticleDesc();
    ArticleContentVO queryArticleById(Integer articleId);
}
