package com.wyu.ibm.service;

import com.wyu.ibm.entity.Student;

import java.util.List;

public interface StudentService {

    //Admin用户可以对student表进行的操作
    public List<Student> getAllStudentToAdmin();
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(Integer id);

    //teacher用户可以对student表进行的操作
    public List<Student> getAllStudentToTeacher();
//  public int insertStudentScore(double score);
    public int updateStudentScore(Student student);

    //student用户可以对student表进行的操作
    public Student getStudentById(Integer id);
    public int updateStudentPassword(Student student);
}
