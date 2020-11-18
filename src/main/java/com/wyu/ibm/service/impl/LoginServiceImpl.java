package com.wyu.ibm.service.impl;

import com.wyu.ibm.entity.LoginBean;
import com.wyu.ibm.mapper.LoginMapper;
import com.wyu.ibm.service.LoginService;
import com.wyu.ibm.util.LoginResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginMapper loginMapper;

    @Override
    public LoginResult checkLogin(LoginBean loginBean) {
        String type=loginBean.getType();
        String userName=loginBean.getUserName();
        String password=loginBean.getPassword();

        System.out.println("用户类型："+type);
        System.out.println("用户名："+userName);
        System.out.println("密码:"+password);

        String name;
        LoginResult loginResult=new LoginResult();
        loginResult.setUrl("false");

        switch (type){
            case "管理员":
                name=loginMapper.getAdminByUserName(userName).getName();
                String passwordFromDBAdmin=loginMapper.getAdminByUserName(userName).getPassword();
                if(passwordFromDBAdmin.equals(password)){
                    loginResult.setName(name);
                    loginResult.setUrl("Admin");
                    return loginResult;
                }
                break;
            case "老师":
                name=loginMapper.getTeacherByUserName(userName).getName();
                String passwordFromDBTeacher=loginMapper.getTeacherByUserName(userName).getPassword();
                if(passwordFromDBTeacher.equals(password)){
                    loginResult.setName(name);
                    loginResult.setUrl("Teacher");
                    return loginResult;
                }
                break;
            case "学生":
                name=loginMapper.getStudentByUserName(userName).getName();
                String passwordFromDBStudent=loginMapper.getStudentByUserName(userName).getPassword();
                if(passwordFromDBStudent.equals(password)){
                    loginResult.setName(name);
                    loginResult.setUrl("Student");
                    return loginResult;
                }
                break;
            default:

        }
        return loginResult;
    }
}
