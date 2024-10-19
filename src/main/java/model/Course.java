package model;

import enums.CourseTaken;

public class Course {

    private CourseTaken courseTaken;


    public Course(CourseTaken courseTaken) {
        this.courseTaken = courseTaken;
    }

    public CourseTaken getCourse() {
        return courseTaken;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTaken=" + courseTaken +
                '}';
    }
}
