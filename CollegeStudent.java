package com.homeWorks;

public class CollegeStudent extends Student {

    public int year;

    public String majorSubject;


    public CollegeStudent(String name, String gender, int age, int year, String majorSubject, String idNumber, double gpa) {
        super(name, gender, age, idNumber, gpa );
        this.year = year;
        this.majorSubject = majorSubject;
    }

    public CollegeStudent(){
        System.out.print ("I am a college student ");
    }

    public int getYear() {
        return year;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", majorSubject='" + majorSubject + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
