package com.syj.controller;

import com.syj.entity.Student;
import com.syj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/listStudent")
    public String listStudent(HttpServletRequest request){
        List<Student> students = studentService.listStudent();
        request.setAttribute("students", students);
        return "listStudent";
    }

    @RequestMapping("/addStudent")
    public String addStudent(String name, int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.addStudent(student);
        return "redirect:listStudent";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(int id){
        studentService.deleteStudent(id);
        return "redirect:listStudent";
    }

}
