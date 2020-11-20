package com.wyu.ibm.controller;

import com.wyu.ibm.entity.Teacher;
import com.wyu.ibm.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TeacherController {
    @Autowired
    TeacherServiceImpl teacherService;

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

    /*Teacher用户对teacher表的操作*/
    //teacher界面修改老师的密码
    @PostMapping("/updateTeacherPassword")
    public int updateTeacherPassword(@RequestBody Teacher teacher){
        return teacherService.updateTeacherPassword(teacher);
    }

}
