package model;

import baseModel.Person;
import enums.Gender;

public class Applicant extends Person {
    public Applicant(String name, int age, Gender gender) {
        super(name, age, gender);
    }
}
