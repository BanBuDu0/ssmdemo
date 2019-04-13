package com.syj.service;

import com.syj.entity.Student;
import java.util.List;


public interface StudentService {
    void addStudent(Student student);

    List<Student> listStudent();

    void deleteStudent(int id);
}
