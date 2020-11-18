package com.wyu.ibm.mapper;

import com.wyu.ibm.entity.LoginBean;

public interface LoginMapper {
    public LoginBean getAdminByUserName(String userName);
    public LoginBean getTeacherByUserName(String userName);
    public LoginBean getStudentByUserName(String userName);
}
