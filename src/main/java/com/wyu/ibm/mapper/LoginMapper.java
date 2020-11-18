package com.wyu.ibm.mapper;

import com.wyu.ibm.entity.Admin;
import com.wyu.ibm.entity.LoginBean;
import com.wyu.ibm.entity.Student;
import com.wyu.ibm.entity.Teacher;

public interface LoginMapper {
    public LoginBean getAdminByUserName(String userName);
    public LoginBean getTeacherByUserName(String userName);
    public LoginBean getStudentByUserName(String userName);
}
