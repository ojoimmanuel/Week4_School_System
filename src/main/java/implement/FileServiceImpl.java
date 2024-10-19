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
                Student student = new Student(studentNames, 15, Gender.MALE);
                file.getStudentLists().add(student);
                System.out.println(studentNames);
            }

            System.out.println("\n*****TEACHER NAMES FROM FILE*****");
            for (CSVRecord csvRecord : csvRecords) {
                String teacherNames = csvRecord.get(file.getTeacherNameHeader());
                Teacher teacher = new Teacher(teacherNames, 15, Gender.FEMALE, CourseTaken.ENGLISH);
                file.getTeacherLists().add(teacher);
                System.out.println(teacherNames);
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
