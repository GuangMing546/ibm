package com.wyu.ibm.controller;

import com.wyu.ibm.entity.Student;
import com.wyu.ibm.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    /*Admin用户对学生表的操作的操作*/

    //Admin页面按展示所有学生的信息
    @GetMapping("/getStudentsToAdmin")
    public List<Student> getStudentsToAdmin(){
        return studentService.getAllStudentToAdmin();
    }
    //Admin界面插入学生功能
    @PostMapping("/insertStudent")
    public int insertStudent(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.insertStudent(student);
    }
    //Admin界面修改学生功能
    @PostMapping("/updateStudent")
    public int updateStudent(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.updateStudent(student);
    }
    //Admin界面删除学生功能
    @PostMapping("/deleteStudent")
    public int deleteStudent(@RequestBody Integer id){
        return studentService.deleteStudentById(id);
    }



    /*Teacher用户对学生表的操作*/
    //teacher界面展示所有的学生信息
    @GetMapping("/getStudentsToTeacher")
    public List<Student> getStudentsToTeacher(){
        return studentService.getAllStudentToTeacher();
    }
    //teacher界面修改学生的成绩
    @PostMapping("/updateScoreFromTeacher")
    public int updateStudentScore(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.updateStudentScore(student);
    }

    /*Student用户对学生表的操作*/
    //student界面修改学生的密码
    @PostMapping("/updateStudentPassword")
    public int updateStudentPassword(@RequestBody Student student){
        return studentService.updateStudentPassword(student);
    }

    @GetMapping("/getStudentById")
    public Student getStudentById(Integer id){
        return studentService.getStudentById(id);
    }


}
