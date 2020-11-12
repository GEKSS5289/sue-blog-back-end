package com.sue.api.controller;

import com.sue.model.dto.DynamicDTO;
import com.sue.model.dto.MessageDTO;
import com.sue.model.vo.admin.CategoryVO;
import com.sue.model.vo.toc.MessageVO;
import com.sue.support.response.ResponseContainer;
import com.sue.service.toc.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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



    @GetMapping("message")
    public ResponseContainer queryMessage(){
        List<MessageVO> messageVOS = indexService.queryMessages();
        return ResponseContainer.ideality(messageVOS);
    }




}
