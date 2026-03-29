package com.student.demo.app.dto;

public class Student {

    private String name;
    private String university;
    private int marks;
    private int rollNo;

    public Student(String name, String university, int marks, int rollNo) {
        this.name = name;
        this.university = university;
        this.marks = marks;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
