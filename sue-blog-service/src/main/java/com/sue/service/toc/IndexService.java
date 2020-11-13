package com.sue.service.toc;

import com.sue.model.dto.DynamicDTO;
import com.sue.model.dto.MessageDTO;
import com.sue.model.entity.Dynamic;
import com.sue.model.vo.toc.MessageVO;

import java.util.List;

/**
 * @author sue
 * @date 2020/10/8 20:34
 */


public interface IndexService {
    List<Dynamic> queryDynamic();
    void createMessage(MessageDTO messageDTO);

}
