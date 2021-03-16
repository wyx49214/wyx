package com.wyx.springboot.service.impl;

import com.wyx.springboot.entity.Student;
import com.wyx.springboot.mapper.StudentMapper;
import com.wyx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}
