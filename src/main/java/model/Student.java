package model;

import baseModel.Person;
import enums.Clas;
import enums.CourseTaken;
import enums.Gender;

public class Student extends Person {

    Clas clas;
    CourseTaken courseTaken;

    public Student(String name, int age, Gender gender) {
        super(name, age, gender);
    }
}
