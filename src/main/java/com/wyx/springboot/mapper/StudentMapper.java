package com.wyx.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyx.springboot.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getAll();

    @Select("select * from student")
    public List<Student> findAll();

    @Update("update student set studentName = #{studentName} where studentNo = #{studentNo}")
    public Integer update(@Param("studentName") String studentName ,@Param("studentNo") Integer studentNo);

}
