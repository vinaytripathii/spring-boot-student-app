package com.student.demo.app.controller;


import com.student.demo.app.dto.Student;
import com.student.demo.app.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }


    //getting student details
   @RequestMapping(value="/student", method= RequestMethod.GET)
    public List<Student> getStudent()
    {
            return studentService.getStudent();
    }
    //Create Student
    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody Student student)
    {
        return studentService.createStudent(student);
    }

    //Update student
    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student)
    {
        return  studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{rollNo}")
    public String deleteStudent(@PathVariable int rollNo)
    {
        return studentService.deleteStudent(rollNo);
    }

}
