package com.example.hospital.management.system;

public class Patient {
    private int PatientId;
    private String name;
    private String disease;
    private int age;

    public Patient(int PatientId, String name, String disease, int age) {
        this.PatientId = PatientId;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int patientId) {
       this. PatientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
