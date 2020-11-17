package com.sue.service.admin;

import com.sue.model.vo.MessageMngVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sue
 * @date 2020/11/13 10:30
 */
@Service
public interface MessageMngService {
    List<MessageMngVO> queryNotCheckMessages();
    List<MessageMngVO> queryPassMessage();
    void passMessage(Integer messageId);
    void failMessage(Integer messageId);
    void deleteMessage(Integer messageId);
}
