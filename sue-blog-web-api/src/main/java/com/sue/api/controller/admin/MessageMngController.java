package com.sue.api.controller.admin;

import com.sue.model.vo.admin.MessageMngVO;
import com.sue.service.admin.MessageMngService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author sue
 * @date 2020/11/13 10:29
 */

@RestController
@RequestMapping("admin")
public class MessageMngController {

    @Autowired
    private MessageMngService messageMngService;

    @GetMapping("message")
    public ResponseContainer queryNotCheckMessage(){
        List<MessageMngVO> messageVOS = messageMngService.queryNotCheckMessages();
        return ResponseContainer.ideality(messageVOS);
    }

    @GetMapping("message/pass")
    public ResponseContainer queryPassedMessage(){
        List<MessageMngVO> messageMngVOS = messageMngService.queryPassMessage();
        return  ResponseContainer.ideality(messageMngVOS);
    }

    @PutMapping("message/pass/{messageId}")
    public ResponseContainer passMessage(@PathVariable @Valid @NotNull(message = "messageId不能为空") Integer messageId){
        messageMngService.passMessage(messageId);
        return ResponseContainer.ideality();
    }


    @PutMapping("message/fail/{messageId}")
    public ResponseContainer failMessage(@PathVariable @Valid @NotNull(message = "messageId不能为空") Integer messageId){
        messageMngService.failMessage(messageId);
        return ResponseContainer.ideality();
    }

    @DeleteMapping("message/{messageId}")
    public ResponseContainer deleteMessage(@PathVariable @Valid @NotNull(message = "messageId不能为空") Integer messageId){
        messageMngService.deleteMessage(messageId);
        return ResponseContainer.ideality();
    }
}
