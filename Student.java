package com.homeWorks;

public class Student extends Person /*implements Drinkable, Sleep*/ {

    public String idNumber;

    public double gpa;


    public Student(String name, String gender, int age, String idNumber, double gpa) {
        super(name, gender, age);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
