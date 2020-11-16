package com.wyu.ibm.service.impl;

import com.wyu.ibm.entity.Student;
import com.wyu.ibm.mapper.StudentMapper;
import com.wyu.ibm.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudentToAdmin() {
        return studentMapper.getAllStudentToAdmin();
    }

    @Override
    public int insertStudent(Student student) {
        return insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudentById(Integer id) {
        return studentMapper.deleteStudentById(id);
    }

    @Override
    public List<Student> getAllStudentToTeacher() {
        return studentMapper.getAllStudentToTeacher();
    }

    @Override
    public int updateStudentScore(Student student) {
        return studentMapper.updateStudentScore(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public int updateStudentPassword(Student student) {
        return studentMapper.updateStudentPassword(student);
    }
}
