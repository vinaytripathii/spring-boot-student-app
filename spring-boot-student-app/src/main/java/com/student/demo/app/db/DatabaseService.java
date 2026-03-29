package com.student.demo.app.db;

import com.student.demo.app.dto.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DatabaseService {

    private Map<Integer, Student> studentDB = new HashMap<>();

    public List<Student> getStudent()
    {
        return new ArrayList<Student>(studentDB.values());
    }

    public ResponseEntity<String> createStudent(Student student)
    {
        studentDB.putIfAbsent(student.getRollNo(),student);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("User Created");
    }

    public String updateStudent(Student student)
    {
        if(studentDB.containsKey(student.getRollNo()))
        {
            studentDB.put(student.getRollNo(),student);
            return "update successfully";
        }
        return "update failed !! please check the parameter";
    }

    public String deleteStudent(int rollNo)
    {
        studentDB.remove(rollNo);
        return  "user deleted";
    }

}
