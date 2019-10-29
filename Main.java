package com.homeWorks;

import com.homeWorks.Person;
import com.homeWorks.Student;
import com.homeWorks.Teacher;
import com.homeWorks.CollegeStudent;

public class Main {

    public static void main (String[]args){
        Person vasja = new Person("Vasja", "M", 20 );
        Student katja =new Student("Katja","F", 30, "765234", 4.2 );
        katja.drink();
        Teacher jenja = new Teacher("Jenja", "M", 28, 2000, "Java");
        CollegeStudent sasha = new CollegeStudent("Sasha", "M", 31, 1, "Java", "756259", 2.1 );
       /* Person vova = new Person();
        System.out.println();
        Student jura = new Student();
        System.out.println();
        CollegeStudent petja = new CollegeStudent();
        System.out.println();
        Teacher misha = new Teacher();
        System.out.println();*/



        Person persons [] = new Person[] {vasja, katja, jenja, sasha/*, vova, jura, petja, misha*/};
            for (int i =0; i<persons.length; i++) {
                System.out.println(persons[i].toString());
            }
        //sasha.drink();

    }
}
