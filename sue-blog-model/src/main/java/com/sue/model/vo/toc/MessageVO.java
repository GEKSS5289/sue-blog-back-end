package com.sue.model.vo.toc;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author sue
 * @date 2020/11/11 20:03
 */

@Data
public class MessageVO {
    private String content;
    private Date createdTime;
}
