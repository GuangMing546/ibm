package com.wyu.ibm.mapper;

import com.wyu.ibm.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    //Admin用户可以对teacher表进行的操作
    public List<Teacher> getAllTeacher();

    public int insertTeacher(Teacher teacher);

    public int updateTeacher(Teacher teacher);

    public int deleteTeacherById(Integer id);

    //Teacher用户可以对teacher表进行的操作
    public int updateTeacherPassword(Teacher teacher);
}
