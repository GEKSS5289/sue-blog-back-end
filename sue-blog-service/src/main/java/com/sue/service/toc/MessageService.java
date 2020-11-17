package com.sue.service.toc;

import com.sue.model.vo.MessageVO;

import java.util.List;

/**
 * @author sue
 * @date 2020/11/13 10:30
 */

public interface MessageService {
    List<MessageVO> queryMessages();
}
