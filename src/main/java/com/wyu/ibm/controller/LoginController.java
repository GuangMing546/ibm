package com.wyu.ibm.controller;

import com.wyu.ibm.entity.LoginBean;
import com.wyu.ibm.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class LoginController {
    @Autowired
    LoginServiceImpl loginService;



    @PostMapping("/login")
    public String login(@RequestBody LoginBean loginBean){
        int flag=loginBean.getFlag();
        System.out.println(flag);
        String userName=loginBean.getUserName();
        String password=loginBean.getPassword();
        switch (flag){
            case 0:
                String passwordFromDBAdmin=loginService.getAdminByUserName(userName).getPassword();
                if(passwordFromDBAdmin.equals(password)){
                    return "localhost:8080/#/Admin";
                }
                break;
            case 1:
                String passwordFromDBTeacher=loginService.getTeacherByUserName(userName).getPassword();
                if(passwordFromDBTeacher.equals(password)){
                    return "true";
                }
                break;
            case 2:
                String passwordFromDBStudent=loginService.getStudentByUserName(userName).getPassword();
                if(passwordFromDBStudent.equals(password)){
                    return "true";
                }
                break;
            default:

        }
        return "false111";
    }
}
