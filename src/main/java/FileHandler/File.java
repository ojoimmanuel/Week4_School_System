package FileHandler;

import model.Student;
import model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class File {

 //   String desktopPath; // = System.getProperty("user.home") + "/Desktop";
    String filePath;
    String studentNameHeader;
    String studentAgeHeader;
    String studentGenderHeader;
    String teacherNameHeader;
    String teacherAgeHeader;
    String teacherGenderHeader;
    List<Student> studentLists;
    List<Teacher> teacherLists;


    public File(String filePath, String studentNameHeader, String studentAgeHeader, String studentGenderHeader,
                String teacherNameHeader, String teacherAgeHeader, String teacherGenderHeader) {
        this.filePath = filePath;
        this.studentNameHeader = studentNameHeader;
        this.studentAgeHeader = studentAgeHeader;
        this.studentGenderHeader = studentGenderHeader;
        this.teacherNameHeader = teacherNameHeader;
        this.teacherAgeHeader = teacherAgeHeader;
        this.teacherGenderHeader = teacherGenderHeader;
        this.studentLists = new ArrayList<>();
        this.teacherLists = new ArrayList<>();
    }

    public String getFilePath() {
        return filePath;
    }

    public String getStudentNameHeader() {
        return studentNameHeader;
    }

    public String getTeacherNameHeader() {
        return teacherNameHeader;
    }

    public List<Student> getStudentLists() {
        return studentLists;
    }

    public String getTeacherGenderHeader() {
        return teacherGenderHeader;
    }

    public String getStudentGenderHeader() {
        return studentGenderHeader;
    }

    public String getTeacherAgeHeader() {
        return teacherAgeHeader;
    }

    public String getStudentAgeHeader() {
        return studentAgeHeader;
    }

    public List<Teacher> getTeacherLists() {
        return teacherLists;
    }
}
