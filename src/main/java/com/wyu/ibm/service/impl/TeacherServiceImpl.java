package com.wyu.ibm.service.impl;

import com.wyu.ibm.entity.Teacher;
import com.wyu.ibm.mapper.TeacherMapper;
import com.wyu.ibm.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherMapper.getAllTeacher();
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        return teacherMapper.insertTeacher(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }

    @Override
    public int deleteTeacherById(Integer id) {
        return teacherMapper.deleteTeacherById(id);
    }

    @Override
    public int updateTeacherPassword(Teacher teacher) {
        return teacherMapper.updateTeacherPassword(teacher);
    }
}
