package com.homeWorks;

public class Teacher extends Person /*implements Killable, Drinkable, Sleep*/ {

    private double salary;

    private String subject;

    public Teacher(String name, String gender, int age, double salary, String subject) {
        super(name, gender, age);
        this.salary = salary;
        this.subject = subject;
    }

    public Teacher() {
        System.out.println("I am a teacher ");
    }

    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
