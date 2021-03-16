package com.wyx.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;

@Data
@TableName(value = "student")
public class Student implements Serializable {

    @TableId(value = "studentNo")
    private Integer studentNo;
    @TableField(select = false)
    private String loginPwd;
    @TableField(value = "studentName")
    private String studentName;
    @TableField(exist = true)
    private String sex;
    @TableField(value = "gradeID")
    private Integer greadeId;
    private String phone;


}
