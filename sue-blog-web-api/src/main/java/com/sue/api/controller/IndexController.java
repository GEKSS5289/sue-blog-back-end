package com.sue.api.controller;

import com.sue.model.dto.MessageDTO;
import com.sue.support.response.ResponseContainer;
import com.sue.service.toc.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public ResponseContainer queryDyNamicList(){
        return ResponseContainer.ideality(indexService.queryDynamic());
    }



    @PostMapping("message")
    public ResponseContainer message(@Valid @RequestBody MessageDTO messageDTO){
        indexService.createMessage(messageDTO);
        return ResponseContainer.ideality();
    }







}
