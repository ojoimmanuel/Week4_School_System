package service;

import model.*;

public interface SchoolProfileService {

    public void addApplicant(Applicant applicant);

    public void addClassRoom(ClassRoom classRoom);

    public void addCourse(Course course);

    public void addNonAcademicStaff(NonAcademicStaff nonAcademicStaff);

    public void addPrincipal(Principal principal);

    public void addStudent(Student student);

    public void addTeacher(Teacher teacher);

    public void displayProfile();
}
