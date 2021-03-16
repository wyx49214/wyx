package com.wyx.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "subjectNo", type = IdType.AUTO)
    private Integer subjectNo;

    @TableField("subjectName")
    private String subjectName;

    @TableField("classHour")
    private Integer classHour;

    @TableField("gradeID")
    private Integer gradeID;


}
