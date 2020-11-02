package com.sue.service.impl.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sue.common.enums.ArticleEnums;
import com.sue.mapper.ArticleMapper;
import com.sue.model.dto.ArticleDTO;
import com.sue.model.entity.Article;
import com.sue.model.entity.Dynamic;
import com.sue.model.vo.admin.ArticleMngDescVO;
import com.sue.service.admin.ArticleMngService;
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
 * @date 2020/10/31 18:10
 */

@Service
public class ArticleMngServiceImpl implements ArticleMngService {


    @Autowired
    private ArticleMapper articleMapper;


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveArticle(ArticleDTO articleDTO) {

        Date createDate = new Date();
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO,article);
        article.setCreatedTime(createDate);
        article.setUpdateTime(createDate);
        article.setIsShow(ArticleEnums.SHOW.getCode());
        article.setCommentCounts(0);
        articleMapper.insert(article);
    }

    @Override
    public List<ArticleMngDescVO> queryArticleDescList() {

        Example example = new Example(Article.class);
        Example.Criteria criteria = example.createCriteria();
        example.orderBy("createdTime").desc();
        criteria.andEqualTo("isShow",1);

        List<Article> articles = articleMapper.selectByExample(example);

        List<ArticleMngDescVO> articleDescVOS = articles
                .stream()
                .map(article -> new ArticleMngDescVO(
                        article.getId(),
                        article.getTitle(),
                        article.getCreatedTime())
                ).collect(Collectors.toList());

        return articleDescVOS;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteArticle(Integer articleId) {
        Article article = new Article();
        article.setId(articleId);
        articleMapper.delete(article);
    }


}
