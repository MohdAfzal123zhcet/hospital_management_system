package com.example.hospital.management.system.Models;

public class Doctor {

    private int doctorid;
    private String name;
    private String specialization;
    private int age;
    private String degree;


    public Doctor(int doctorid, String name, String specialization, int age, String degree) {
        this.doctorid = doctorid;
        this.name = name;
        this.specialization = specialization;
        this.age = age;
        this.degree = degree;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}