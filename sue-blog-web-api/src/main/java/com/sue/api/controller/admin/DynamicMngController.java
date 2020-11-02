package com.sue.api.controller.admin;

import com.sue.model.dto.DynamicDTO;
import com.sue.model.dto.DynamicUpdateDTO;
import com.sue.service.admin.DynamicMngServic;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author sue
 * @date 2020/11/1 18:31
 */

@RestController
@RequestMapping("admin")

public class DynamicMngController {

    @Autowired
    private DynamicMngServic dynamicMngServic;

    @GetMapping("dynamic")
    public ResponseContainer queryDyNamicList(){

        return ResponseContainer.ideality(dynamicMngServic.queryDynamic());
    }


    @PostMapping("dynamic")
    public ResponseContainer writeDyNamic(
            @Valid
            @RequestBody DynamicDTO dynamicDTO
    ){
        dynamicMngServic.saveDynamic(dynamicDTO);
        return ResponseContainer.ideality();
    }

    @DeleteMapping("dynamic/{dynamicId}")
    public ResponseContainer deleteDyNamic(
            @PathVariable
            @Valid
            @NotNull(message = "动态id不能为空") Integer dynamicId
    ){
        dynamicMngServic.deleteDynamic(dynamicId);
        return ResponseContainer.ideality();
    }


    @PutMapping("dynamic/{dynamicId}")
    public ResponseContainer updateDynamic(
            @PathVariable
            @Valid
            @NotNull(message = "动态id不能为空")Integer dynamicId,
            @Valid @RequestBody DynamicUpdateDTO dynamicUpdateDTO
    ){
        dynamicMngServic.updateDynamic(dynamicId,dynamicUpdateDTO);
        return ResponseContainer.ideality();
    }


}
