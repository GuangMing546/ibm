package com.wyu.ibm.mapper;

import com.wyu.ibm.entity.Admin;
import com.wyu.ibm.entity.Student;
import com.wyu.ibm.entity.Teacher;

public interface LoginMapper {
    public Admin getAdminByUserName(String userName);
    public Teacher getTeacherByUserName(String userName);
    public Student getStudentByUserName(String userName);
}
