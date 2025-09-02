package com.github.ajg_iz;

import java.util.HashMap;
import java.util.Map;

public class School {
    Map<Integer,Student> students;

    public School() {
        this.students = new HashMap<>();
    }
    public School(Map<Integer,Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.put(student.getStudentID(),student);
    }

    public void printStudentList() {
        for (Student student : this.students.values()) {
            System.out.println(student.toString());
        }
    }

    public Student getStudentByID(int id) {
        return students.get(id);
    }

    public boolean removeStudentByID(int id) {
        if (getStudentByID(id) != null) {
            this.students.remove(id);
            return true;
        }
        return false;
    }
}
