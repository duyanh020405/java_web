package com.data.ss1btvn;

public class Student {
    private String name;
    private int age;
    private String type;
    private String licensePlate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    // Constructor
    public Student(String name, int age , String type, String licensePlate) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.licensePlate = licensePlate;

    }
}
