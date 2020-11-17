package com.wyu.ibm.service;

import com.wyu.ibm.entity.Admin;
import com.wyu.ibm.entity.Student;
import com.wyu.ibm.entity.Teacher;

public interface LoginService {
    public Admin getAdminByUserName(String userName);
    public Teacher getTeacherByUserName(String userName);
    public Student getStudentByUserName(String userName);
}
