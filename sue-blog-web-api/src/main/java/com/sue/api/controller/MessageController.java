package com.sue.api.controller;

import com.sue.model.vo.toc.MessageVO;
import com.sue.service.toc.MessageService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sue
 * @date 2020/11/13 10:29
 */

@RestController
@RequestMapping("blog")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("message")
    public ResponseContainer queryMessage(){
        List<MessageVO> messageVOS = messageService.queryMessages();
        return ResponseContainer.ideality(messageVOS);
    }




}
