package implement;

import model.Course;
import model.Student;
import model.Teacher;
import service.CourseService;

public class CourseServiceImpl implements CourseService {
    @Override
    public void teachCourse(Teacher teacher, Course course) {
        System.out.println(teacher.getName() + " is a " + teacher.getGender() + " teacher, who teaches " +
                course.getCourse());
    }

    @Override
    public void takeCourse(Student student, Course course) {
        System.out.println(student.getName() + " is a " + student.getGender() + " student, age " + student.getAge() +
                 ", and takes the " + course.getCourse() + " course");
    }
}
