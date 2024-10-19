package implement;

import FileHandler.File;
import enums.CourseTaken;
import enums.Gender;
import model.Student;
import model.Teacher;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import service.FileService;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService {
    @Override
    public void displayFileContent(File file) {

        try {
            Reader reader = new FileReader(file.getFilePath());
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader()) ;
            List<CSVRecord> csvRecords = csvParser.getRecords();


            System.out.println("\n*****STUDENT NAMES FROM FILE*****");
            for (CSVRecord csvRecord : csvRecords) {
                String studentNames = csvRecord.get(file.getStudentNameHeader());
                String studentAge = csvRecord.get(file.getStudentAgeHeader());
                String studentGender = csvRecord.get(file.getStudentGenderHeader());
                Student student = new Student(studentNames, Integer.parseInt(studentAge), Gender.valueOf(studentGender.toUpperCase()));//Gender.MALE);
                file.getStudentLists().add(student);
                System.out.println(studentNames + ", Age " + studentAge + " Gender: " + studentGender);
            }

            System.out.println("\n*****TEACHER NAMES FROM FILE*****");
            for (CSVRecord csvRecord : csvRecords) {
                String teacherNames = csvRecord.get(file.getTeacherNameHeader());
                String teacherAges = csvRecord.get(file.getTeacherAgeHeader());
                String teacherGender = csvRecord.get(file.getTeacherGenderHeader());
                Teacher teacher = new Teacher(teacherNames, Integer.parseInt(teacherAges), Gender.valueOf(teacherGender.toUpperCase()));
                file.getTeacherLists().add(teacher);
                System.out.println(teacherNames + ", Age: " + teacherAges + " Gender: " + teacherGender );
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
