package model;

import java.util.ArrayList;
import java.util.List;

public class SchoolProfile {
    private List<Applicant> applicantList;
    private List<ClassRoom> classRoomList;
    private List<Course> courseList;
    private List<NonAcademicStaff> nonAcademicStaffList;
//    private List<Principal> principalList;
    private List<Student> studentList;
    private List<Teacher> teacherList;
    private String principalName;


    public SchoolProfile() {
        this.applicantList = new ArrayList<>();
        this.classRoomList = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.nonAcademicStaffList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    public List<Applicant> getApplicantList() {
        return applicantList;
    }

    public List<ClassRoom> getClassRoomList() {
        return classRoomList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public List<NonAcademicStaff> getNonAcademicStaffList() {
        return nonAcademicStaffList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }
}


