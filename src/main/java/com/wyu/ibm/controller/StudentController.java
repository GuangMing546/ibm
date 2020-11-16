package com.wyu.ibm.controller;

import com.wyu.ibm.entity.Student;
import com.wyu.ibm.service.impl.StudentServiceImpl;
import com.wyu.ibm.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    TeacherServiceImpl teacherService;

    @GetMapping("/getStudents")
    public List<Student> getAllStudent(){
        return studentService.getAllStudentToAdmin();
    }
}
