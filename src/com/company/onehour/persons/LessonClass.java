package com.company.onehour.persons;

import com.company.onehour.persons.Person;

public class LessonClass {
    public static void learn() {

        Person maks = new Person();
            maks.height = 180;
            maks.weight = 73.3f;
            maks.age = 30;
            maks.say("Hi I'm Maks! My height is: " + maks.height);

        Person anton = new Person();
            anton.height = 176;
            anton.weight = 80.1f;
            anton.age = 28;

        Person mark = new Person(175, 79.3f, 25);
        mark.say("Hi I'm Mark, my height is " + mark.height + ". My weight is " + mark.weight +
                ". My age is " +mark.age);

        Student kiril = new Student (170,90,21,3);
        kiril.say("Hi I'm Kiril, my height is " + kiril.height + ". My weight is " + kiril.weight +
                ". My age is " +kiril.age +". I'm a student, my course : "+ kiril.course);
    }
}
