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

    //Teacher用户的操作
    @GetMapping("/getStudentsToTeacher")
    public List<Student> getStudentsToTeacher(){
        return studentService.getAllStudentToTeacher();
    }

    @PostMapping("/updateScoreFromTeacher")
    public int updateStudentScore(@RequestBody Student student){
//        Student student1=new Student();
//        student.setId(1);
//        student.setScore("100");
        System.out.println(student.toString());
        return studentService.updateStudentScore(student);
    }

    //Admin用户对学生表的操作的操作
    @GetMapping("/getStudentsToAdmin")
    public List<Student> getStudentsToAdmin(){
        return studentService.getAllStudentToAdmin();
    }

    @PostMapping("/insertStudent")
    public int insertStudent(@RequestBody Student student){
//        Student student1=new Student();
//        student.setStudentName("hahahah");
        System.out.println(student.toString());
        return studentService.insertStudent(student);
    }
    @PostMapping("/updateStudent")
    public int updateStudent(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.updateStudent(student);
    }
    @PostMapping("/deleteStudent")
    public int deleteStudent(@RequestBody Integer id){
        return studentService.deleteStudentById(id);
    }

    //Admin用户对teacher表的操作
    @GetMapping("/getTeachersToAdmin")
    public List<Teacher> getTeachersToAdmin(){
        return teacherService.getAllTeacher();
    }
    @PostMapping("/insertTeacher")
    public int insertTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher);
        return teacherService.insertTeacher(teacher);
    }
    @PostMapping("/updateTeacher")
    public int updateTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher);
        return teacherService.updateTeacher(teacher);
    }
    @PostMapping("/deleteTeacher")
    public int deleteTeacher(@RequestBody Integer id){
        System.out.println(id);
        return teacherService.deleteTeacherById(id);
    }



}
