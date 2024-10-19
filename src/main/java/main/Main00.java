//package main;
//
//import enums.Clas;
//import enums.CourseTaken;
//import enums.Gender;
//import implement.*;
////import implement.TeacherServiceImpl;
//import model.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println();
//
//        Principal principal = new Principal("Mr. Samuel", 50, Gender.MALE);
//        PrincipalServiceImpl principalInfo = new PrincipalServiceImpl();
//        principalInfo.display(principal);
//
//        System.out.println();
//
//        Teacher teacher1 = new Teacher("Bola", 35, Gender.FEMALE, CourseTaken.ENGLISH);
//        Course course1 = new Course(CourseTaken.ENGLISH);
//        CourseServiceImpl teacher1Course = new CourseServiceImpl();
//        teacher1Course.teachCourse(teacher1, course1);
//
//        Teacher teacher2 = new Teacher("David", 37, Gender.MALE, CourseTaken.MATHS);
//        Course course2 = new Course(CourseTaken.MATHS);
//        CourseServiceImpl teacher2Course = new CourseServiceImpl();
//        teacher2Course.teachCourse(teacher2, course2);
//
//        System.out.println();
//
//        Student student1 = new Student("Shade", 14, Gender.FEMALE);
//        CourseServiceImpl student1Course = new CourseServiceImpl();
//        ClassRoomServiceImpl student1Class = new ClassRoomServiceImpl();
//        ClassRoom student1ClassRoom = new ClassRoom(Clas.CLASS_1);
//        student1Course.takeCourse(student1, course1);
//        student1Class.studentClass(student1, student1ClassRoom);
//
//        Student student2 = new Student("Rock", 16, Gender.MALE);
//        CourseServiceImpl student2Course = new CourseServiceImpl();
//        student2Course.takeCourse(student2, course2);
//        ClassRoom student2ClassRoom = new ClassRoom(Clas.CLASS_2);
//        ClassRoomServiceImpl student2Class = new ClassRoomServiceImpl();
//        student2Class.studentClass(student2, student2ClassRoom);
//
//        System.out.println();
//
//        ExpelStudentServiceImpl student1expelled = new ExpelStudentServiceImpl();
//        student1expelled.expelStudent(student1, principal);
//
//        System.out.println();
//
//        Applicant applicant1 = new Applicant("Mike", 7, Gender.MALE);
//        ApplicantServiceImpl applicantToAdmit1 = new ApplicantServiceImpl();
//        applicantToAdmit1.admitApplicant(applicant1, principal);
//
//        Applicant applicant2 = new Applicant("Mercy", 17, Gender.FEMALE);
//        ApplicantServiceImpl applicantToAdmit2 = new ApplicantServiceImpl();
//        applicantToAdmit1.admitApplicant(applicant2, principal);
//
//        System.out.println();
//
//        NonAcademicStaff nonAcademicStaff1 = new NonAcademicStaff("Nonso", 29, Gender.MALE);
//        NonAcademicStaffServiceimpl nonAcademicStaffServiceimpl1 = new NonAcademicStaffServiceimpl();
//        nonAcademicStaffServiceimpl1.display(nonAcademicStaff1);
//
//        System.out.println();
//        SchoolProfile schoolProfile = new SchoolProfile();
//        SchoolProfileServiceImpl schoolProfileImpl = new SchoolProfileServiceImpl();
//        schoolProfileImpl.addPrincipal(principal);
//        schoolProfileImpl.addTeacher(teacher1);
//        schoolProfileImpl.addTeacher(teacher2);
//        schoolProfileImpl.addNonAcademicStaff(nonAcademicStaff1);
//        schoolProfileImpl.addStudent(student1);
//        schoolProfileImpl.addStudent(student2);
//        schoolProfileImpl.addClassRoom(student1ClassRoom);
//        schoolProfileImpl.addClassRoom(student2ClassRoom);
//        schoolProfileImpl.addCourse(course1);
//        schoolProfileImpl.addCourse(course2);
//
//        schoolProfileImpl.displayProfile();
//
//
//
//    }
//}
