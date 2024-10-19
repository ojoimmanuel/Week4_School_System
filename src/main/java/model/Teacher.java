package model;

import baseModel.Person;
import enums.Gender;
import enums.CourseTaken;

public class Teacher extends Person {

//    CourseTaken courseTaken;

    public Teacher(String name, int age, Gender gender) { //CourseTaken courseTaken) {
        super(name, age, gender);
//        this.courseTaken = courseTaken;
    }
}
