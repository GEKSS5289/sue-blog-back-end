package com.sue.model.vo;

import com.sue.model.entity.File;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author sue
 * @date 2020/11/19 22:49
 */

@Data
public class FileVO {

    private Integer id;
    private String fileName;
    private Long fileSize;
    private Date createdTime;
    private Boolean fileUsable;
    public FileVO(File file){
        BeanUtils.copyProperties(file,this);
    }

}
