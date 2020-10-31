package com.sue.api.controller;

import com.sue.support.response.ResponseContainer;
import com.sue.service.toc.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sue
 * @date 2020/10/8 20:22
 */

@RestController
@RequestMapping("blog")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("dynamic")
    public ResponseContainer getnamicList(){

        return ResponseContainer.ideality(indexService.queryDynamic());
    }


    @PostMapping("issue")
    public ResponseContainer issue(){
        return null;
    }


}
