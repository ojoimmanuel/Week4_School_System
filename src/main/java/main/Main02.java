//package main;
//
//
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//
//
//
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;
//import java.util.ArrayList;
//import java.util.List;
//
//
//import enums.Clas;
//import enums.CourseTaken;
//import enums.Gender;
//import implement.*;
//import model.*;
//
//public class Main02 {
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
//        String desktopPath = System.getProperty("user.home") + "/Desktop";
//        String filePath = desktopPath + "/List.csv";
//        String studentNameHeader = "Student";
//        String studentAgeHeader = "StudentAge";
//        String studentGenderHeader = "StudentGender";
//
//        String teacherNameHeader = "Teacher";
//        String teacherAgeHeader = "TeacherAge";
//        String teacherGenderHeader = "TeacherGender";
//        String teacherCourseHeader = "TeacherCourse";
//
//        try (Reader reader = new FileReader(filePath);
//             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
//
//            // List of CSV records (each row is a CSVRecord)
//            List<CSVRecord> csvRecords = csvParser.getRecords();
////            int recordSize = csvRecords.size();
//            List<Student> studentLists = new ArrayList<>();
//            List<Teacher> teacherLists = new ArrayList<>();
//
//
//            // Iterate through the records and print the values under the given header
//            for (CSVRecord csvRecord : csvRecords) {
//                String studentNames = csvRecord.get(studentNameHeader);
//                String studentAge = csvRecord.get(studentAgeHeader);
//                String studentGender = csvRecord.get(studentGenderHeader);
//                Student student = new Student(studentNames, studentAge, studentGender);
//                studentLists.add(student);
////                System.out.println(studentNames);  // Print or process the value under the header
//            }
//
//            for (CSVRecord csvRecord : csvRecords) {
//                String teacherNames = csvRecord.get(teacherNameHeader);
//                Teacher teacher = new Teacher(teacherNames, 15, Gender.FEMALE, CourseTaken.ENGLISH);
//                teacherLists.add(teacher);
//            }
////            System.out.println(studentLists.get(0).getName());  // Print or process the value under the header
//            student1expelled.expelStudent(studentLists.get(0), principal);
//            teacher1Course.teachCourse(teacherLists.get(1), course1);
//            teacher2Course.teachCourse(teacherLists.get(2), course2);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
//
