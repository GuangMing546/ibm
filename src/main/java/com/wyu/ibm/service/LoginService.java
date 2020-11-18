package com.wyu.ibm.service;

import com.wyu.ibm.entity.Admin;
import com.wyu.ibm.entity.LoginBean;
import com.wyu.ibm.entity.Student;
import com.wyu.ibm.entity.Teacher;

public interface LoginService {
    public String checkLogin(LoginBean loginBean);
}
