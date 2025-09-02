package com.github.ajg_iz;

import java.util.Map;
import java.util.HashMap;

public class Pharmacy {
    Map<String, Medication> medications;

    public Pharmacy() {
        medications = new HashMap<>();
    }

    public int getCount() {
        return medications.size();
    }

    void addMedication(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    Medication findMedication(String medicationName) {
        return medications.get(medicationName);
    }

    void removeMedication(String medicationName) {
        medications.remove(medicationName);
    }

    void printMedications() {
        for (Medication medication : medications.values()) {
            System.out.println(medication.toString());
        }
    }
}
