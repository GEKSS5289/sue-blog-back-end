package com.sue.service.toc;

import com.sue.model.dto.MessageDTO;
import com.sue.model.entity.Dynamic;

import java.util.List;

/**
 * @author sue
 * @date 2020/10/8 20:34
 */


public interface IndexService {
    List<Dynamic> queryDynamic();
    void createMessage(MessageDTO messageDTO);

}
