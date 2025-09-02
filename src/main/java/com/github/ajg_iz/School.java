package com.github.ajg_iz;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }
    public School(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printStudentList() {
        for (Student student : this.students) {
            System.out.println(student.toString());
        }
    }

    public Student getStudentByID(int id) {
        for (Student student : this.students) {
            if (student.getStudentID() == id) return student;
        }
        return null;
    }

    public boolean removeStudentByID(int id) {
        if (getStudentByID(id) != null) {
            this.students.remove(getStudentByID(id));
            return true;
        }
        return false;
    }
}
