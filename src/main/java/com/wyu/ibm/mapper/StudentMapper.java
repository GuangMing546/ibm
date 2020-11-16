package com.wyu.ibm.mapper;

import com.wyu.ibm.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface StudentMapper {

    //Admin用户可以对student表进行的操作
    public List<Student> getAllStudentToAdmin();

    public int insertStudent(Student student);

    public int updateStudent(Student student);

    public int deleteStudentById(Integer id);

    //teacher用户可以对student表进行的操作
    public List<Student> getAllStudentToTeacher();

//    public int insertStudentScore(double score);

    public int updateStudentScore(Student student);

    //student用户可以对student表进行的操作
    public Student getStudentById(Integer id);

    public int updateStudentPassword(Student student);

}
