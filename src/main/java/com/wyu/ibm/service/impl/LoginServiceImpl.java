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

    //返回的数据是对象LoginResult：id，url，name
    @Override
    public LoginResult checkLogin(LoginBean loginBean) {
        String type=loginBean.getType();
        String userName=loginBean.getUserName();
        String password=loginBean.getPassword();

        System.out.println("用户类型："+type);
        System.out.println("用户名："+userName);
        System.out.println("密码:"+password);

        LoginResult loginResult=new LoginResult();
        loginResult.setUrl("false");

        String name;
        Integer id;

        switch (type){
            case "管理员":
                loginBean=loginMapper.getAdminByUserName(userName);
                if(null==loginBean){
                    return loginResult;
                }
                name=loginBean.getName();
                id=loginBean.getId();
                String passwordFromDBAdmin=loginBean.getPassword();
                if(passwordFromDBAdmin.equals(password)){
                    loginResult.setId(id);
                    loginResult.setName(name);
                    loginResult.setUrl("Admin");
                    return loginResult;
                }
                break;
            case "老师":
                loginBean=loginMapper.getTeacherByUserName(userName);
                if(null==loginBean){
                    return loginResult;
                }
                name=loginBean.getName();
                id=loginBean.getId();
                String passwordFromDBTeacher=loginBean.getPassword();
                if(passwordFromDBTeacher.equals(password)){
                    loginResult.setId(id);
                    loginResult.setName(name);
                    loginResult.setUrl("Teacher");
                    return loginResult;
                }
                break;
            case "学生":
                loginBean=loginMapper.getStudentByUserName(userName);
                if(null==loginBean){
                    return loginResult;
                }
                name=loginBean.getName();
                id=loginBean.getId();
                String passwordFromDBStudent=loginBean.getPassword();
                if(passwordFromDBStudent.equals(password)){
                    loginResult.setId(id);
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
