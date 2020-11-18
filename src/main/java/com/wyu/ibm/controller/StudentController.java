package com.wyu.ibm.controller;

import com.wyu.ibm.entity.Student;
import com.wyu.ibm.entity.Teacher;
import com.wyu.ibm.service.impl.StudentServiceImpl;
import com.wyu.ibm.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    TeacherServiceImpl teacherService;

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

    /*Admin用户对teacher表的操作*/
    //Admin界面展示所有的老师信息
    @GetMapping("/getTeachersToAdmin")
    public List<Teacher> getTeachersToAdmin(){
        return teacherService.getAllTeacher();
    }
    //Admin界面插入老师功能
    @PostMapping("/insertTeacher")
    public int insertTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher);
        return teacherService.insertTeacher(teacher);
    }
    //Admin界面更新老师功能
    @PostMapping("/updateTeacher")
    public int updateTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher);
        return teacherService.updateTeacher(teacher);
    }
    //Admin界面删除老师功能
    @PostMapping("/deleteTeacher")
    public int deleteTeacher(@RequestBody Integer id){
        System.out.println(id);
        return teacherService.deleteTeacherById(id);
    }

    /*Teacher用户的操作*/
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
    //teacher界面修改老师的密码
    @PostMapping("/updateTeacherPassword")
    public int updateTeacherPassword(Teacher teacher){
        return teacherService.updateTeacherPassword(teacher);
    }

    /*student用户的操作*/
    @PostMapping("/updateStudentPassword")
    public int updateStudentPassword(@RequestBody Student student){
        return studentService.updateStudentPassword(student);
    }


}
