package com.student.demo.app.repository;


import com.student.demo.app.db.DatabaseService;
import com.student.demo.app.dto.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDAO {
    DatabaseService databaseService;
    public StudentDAO(DatabaseService databaseService)
    {
      this.databaseService = databaseService;
    }

    public List<Student> getStudent()
    {
        return databaseService.getStudent();
    }

    public ResponseEntity<String> createStudent(Student student)
    {
        return databaseService.createStudent(student);
    }

    public String updateStudent(Student student)
    {
        return databaseService.updateStudent(student);
    }

    public String deleteStudent(int rollNo)
    {
        return databaseService.deleteStudent(rollNo);
    }

}
