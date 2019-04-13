package com.syj.dao;

import com.syj.entity.Student;

import java.util.List;

public interface StudentDao {
    void addStudent(Student student);

    List<Student> listStudent();

    void deleteStudent(int id);
}
