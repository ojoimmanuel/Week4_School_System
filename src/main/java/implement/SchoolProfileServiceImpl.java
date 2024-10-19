package implement;

import model.*;
import service.SchoolProfileService;

public class SchoolProfileServiceImpl implements SchoolProfileService {

    SchoolProfile schoolProfile = new SchoolProfile();


    @Override
    public void addApplicant(Applicant applicant) {
//        SchoolProfile schoolProfile = new SchoolProfile();
        schoolProfile.getApplicantList().add(applicant);
    }

    @Override
    public void addClassRoom(ClassRoom classRoom) {
        schoolProfile.getClassRoomList().add(classRoom);
    }

    @Override
    public void addCourse(Course course) {
        schoolProfile.getCourseList().add(course);
    }

    @Override
    public void addNonAcademicStaff(NonAcademicStaff nonAcademicStaff) {
        schoolProfile.getNonAcademicStaffList().add(nonAcademicStaff);
    }

    @Override
    public void addPrincipal(Principal principal) {
        schoolProfile.setPrincipalName(principal.getName());
    }

    @Override
    public void addStudent(Student student) {
        schoolProfile.getStudentList().add(student);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        schoolProfile.getTeacherList().add(teacher);
    }

    @Override
    public void displayProfile() {
        System.out.println("SCHOOL PROFILE SUMMARY");
        System.out.println("-----------------------");
        System.out.println("Principal\n- " + schoolProfile.getPrincipalName());

        System.out.println("Teachers");
        for (Teacher teacher : schoolProfile.getTeacherList()) {
            System.out.println("- " + teacher.getName());
        }

        System.out.println("Non-Academic Staff Members");
        for (NonAcademicStaff nonAcademicStaff : schoolProfile.getNonAcademicStaffList()){
            System.out.println("- " + nonAcademicStaff.getName());
        }

        System.out.println("Students");
        for (Student student : schoolProfile.getStudentList()){
            System.out.println("- " + student.getName());
        }

        System.out.println("Class Rooms");
        for (ClassRoom classRoom : schoolProfile.getClassRoomList()){
            System.out.println("- " + classRoom.getClas());
        }

        System.out.println("Courses");
        for (Course course : schoolProfile.getCourseList()){
            System.out.println("- " + course.getCourse());
        }
    }


}
