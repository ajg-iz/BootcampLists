package com.github.ajg_iz;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("John", "Doe", 1));
        school.addStudent(new Student("Jane", "Doe", 2));
        school.addStudent(new Student("Max", "Muster", 3));
        school.printStudentList();
        school.removeStudentByID(3);
        school.printStudentList();
    }

}