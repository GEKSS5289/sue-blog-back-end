package com.sue.model.dto;

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

    /**
     * 文件Id
     */
    @Id
    private Integer id;

    /**
     * 文件名
     */
    @Column(name = "file_name")
    private String fileName;
    /**
     * 文件大小
     */
    @Column(name = "file_size")
    private Long fileSize;
    /**
     * 文件上传时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    public FileVO(File file){
        BeanUtils.copyProperties(file,this);
    }

}
