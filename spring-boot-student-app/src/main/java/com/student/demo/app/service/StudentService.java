package com.student.demo.app.service;


import com.student.demo.app.dto.Student;
import com.student.demo.app.repository.StudentDAO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO)
    {
        this.studentDAO=studentDAO;
    }

    public List<Student> getStudent()
    {
        return new ArrayList<Student>(studentDAO.getStudent());
    }

    public ResponseEntity<String> createStudent(Student student)
    {
        return studentDAO.createStudent(student);
    }
    public String updateStudent(Student student)
    {
        return studentDAO.updateStudent(student);
    }

    public String deleteStudent(int rollNo)
    {
         return studentDAO.deleteStudent(rollNo);

    }


}
