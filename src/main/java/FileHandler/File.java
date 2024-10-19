package FileHandler;

import model.Student;
import model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class File {

 //   String desktopPath; // = System.getProperty("user.home") + "/Desktop";
    String filePath;
    String studentNameHeader;
    String teacherNameHeader;
    List<Student> studentLists;
    List<Teacher> teacherLists;


    public File(String filePath, String studentNameHeader, String teacherNameHeader) {
        this.filePath = filePath;
        this.studentNameHeader = studentNameHeader;
        this.teacherNameHeader = teacherNameHeader;
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

    public List<Teacher> getTeacherLists() {
        return teacherLists;
    }
}
