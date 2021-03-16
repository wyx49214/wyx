package com.wyx.springboot.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.wyx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/index.jsp")
    public String show(Model model){
        System.out.println(123123);
        model.addAttribute("student",studentService.getAll());
        return "index";
    }

}
