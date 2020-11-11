package com.sue.service.impl.toc;

import com.sue.mapper.ArticleMapper;
import com.sue.model.entity.Article;
import com.sue.model.vo.toc.ArticleContentVO;
import com.sue.model.vo.toc.ArticleDescVO;
import com.sue.service.toc.ArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sue
 * @date 2020/10/31 19:37
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<ArticleDescVO> queryArticleDesc() {

        List<ArticleDescVO> articleDescVOS = articleMapper.queryArticleDesc();
        articleDescVOS.forEach(a->{
            a.setCommentCount(1);
            a.setReadCount(1);
        });
//        Example example = new Example(Article.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("isShow",1);
//        example.orderBy("createdTime").desc();
//        List<Article> articles = articleMapper.selectByExample(example);
//
//        List<ArticleDescVO> articleDescVOS = articles
//                .stream()
//                .map(article -> new ArticleDescVO(
//                        article.getId(),
//                        article.getTitle(),
//                        article.getCreatedTime(),
//                        article.getCommentCounts(),2,)
//                ).collect(Collectors.toList());

//        return articleDescVOS;
        return articleDescVOS;
    }

    @Override
    public ArticleContentVO queryArticleById(Integer articleId) {
        Example example = new Example(Article.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("isShow",1);
        criteria.andEqualTo("id",articleId);

        Article article = articleMapper.selectOneByExample(example);
        ArticleContentVO articleContentVO = new ArticleContentVO();
        BeanUtils.copyProperties(article,articleContentVO);
        return articleContentVO;
    }

}
