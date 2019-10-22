package com.homeWorks;

public class CollegeStudent extends Student {

    public int year;

    public String majorSubject;


    public CollegeStudent(String name, String gender, int age, int year, String majorSubject) {
        super(name, gender, age);
        this.year = year;
        this.majorSubject = majorSubject;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "year=" + year +
                ", majorSubject='" + majorSubject + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
