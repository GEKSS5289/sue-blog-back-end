package com.sue.service.admin;

import com.sue.model.dto.DynamicDTO;
import com.sue.model.dto.DynamicUpdateDTO;
import com.sue.model.entity.Dynamic;
import com.sue.support.response.ResponseContainer;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author sue
 * @date 2020/11/1 18:32
 */

public interface DynamicMngServic {

    List<Dynamic> queryDynamic();
    void saveDynamic(DynamicDTO dynamicDTO);
    void deleteDynamic(Integer dynamicId);
    void updateDynamic(Integer dynamicId, DynamicUpdateDTO dynamicUpdateDTO);
}
