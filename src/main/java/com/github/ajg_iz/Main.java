package com.github.ajg_iz;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Instanciating new School and adding 3 Students...");
        School school = new School();
        school.addStudent(new Student("John", "Doe", 1));
        school.addStudent(new Student("Jane", "Doe", 2));
        school.addStudent(new Student("Max", "Muster", 3));
        school.printStudentList();
        System.out.println("Removing Student with ID 3...");
        school.removeStudentByID(3);
        school.printStudentList();
        System.out.println("Instanciating new Pharmacy and adding 3 Medications...");
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addMedication(new Medication("Aspirin", 2.99d, 5));
        pharmacy.addMedication(new Medication("Tylenol", 3.99d, 15));
        pharmacy.addMedication(new Medication("Paracetamol", 2.49d, 12));
        pharmacy.printMedications();
        System.out.println("Removing Paracetamol from the Pharmacy...");
        pharmacy.removeMedication("Paracetamol");
        pharmacy.printMedications();
    }

}