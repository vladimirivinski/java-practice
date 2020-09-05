package com.company;

public class Student extends Person {
    int course;

    public Student (int height, float weight, int age, int course){
        super (height, weight, age); // передает переменные с конструктора
        this.course = course;
    }
}
