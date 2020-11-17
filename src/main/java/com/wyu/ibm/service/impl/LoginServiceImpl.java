package com.wyu.ibm.service.impl;

import com.wyu.ibm.entity.Admin;
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
    public Admin getAdminByUserName(String userName) {
        return loginMapper.getAdminByUserName(userName);
    }

    @Override
    public Teacher getTeacherByUserName(String userName) {
        return loginMapper.getTeacherByUserName(userName);
    }

    @Override
    public Student getStudentByUserName(String userName) {
        return loginMapper.getStudentByUserName(userName);
    }
}
