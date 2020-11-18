package com.wyu.ibm.service.impl;

import com.wyu.ibm.entity.Admin;
import com.wyu.ibm.entity.LoginBean;
import com.wyu.ibm.entity.Student;
import com.wyu.ibm.entity.Teacher;
import com.wyu.ibm.mapper.LoginMapper;
import com.wyu.ibm.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginMapper loginMapper;

    @Override
    public String checkLogin(LoginBean loginBean) {
        System.out.println(loginBean.getUserName());
        System.out.println(loginBean.getPassword());
        String type=loginBean.getType();

        System.out.println(type);
        String userName=loginBean.getUserName();
        String password=loginBean.getPassword();
        switch (type){
            case "管理员":
                String passwordFromDBAdmin=loginMapper.getAdminByUserName(userName).getPassword();
                if(passwordFromDBAdmin.equals(password)){
                    return "Admin";
                }
                break;
            case "老师":
                String passwordFromDBTeacher=loginMapper.getTeacherByUserName(userName).getPassword();
                if(passwordFromDBTeacher.equals(password)){
                    return "localhost:8080/#/Teacher";
                }
                break;
            case "学生":
                String passwordFromDBStudent=loginMapper.getStudentByUserName(userName).getPassword();
                if(passwordFromDBStudent.equals(password)){
                    return "localhost:8080/#/Student";
                }
                break;
            default:

        }
        return "false";
    }
}
