package com.qfedu.controller;

import com.qfedu.entity.Student;
import com.qfedu.service.StudentService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("studentAdd.do")
    public ResultVo add(Student student) {
        return studentService.addStudent(student);
    }

}
