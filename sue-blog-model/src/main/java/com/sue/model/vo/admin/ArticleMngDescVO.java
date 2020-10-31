package com.sue.model.vo.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author sue
 * @date 2020/10/31 18:42
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleMngDescVO {


    private Integer id;
    private String title;
    private Date createdTime;

}
