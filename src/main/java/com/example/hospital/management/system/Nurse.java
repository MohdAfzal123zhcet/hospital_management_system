package com.example.hospital.management.system;

public class Nurse {
    private int nurseid;
    private int age;
    private String name;
    private String qualification;

    public Nurse(int nurseid, int age, String name, String qualification) {
        this.nurseid = nurseid;
        this.age = age;
        this.name = name;
        this.qualification = qualification;
    }

    public int getNurseid() {
        return nurseid;
    }

    public void setNurseid(int nurseid) {
        this.nurseid = nurseid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
