//package main;
//
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//
//
////import org.apache.commons.*;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;
//import java.util.List;
//
//public class ReadFile {
//    public static void main(String[] args) {
//        String desktopPath = System.getProperty("user.home") + "/Desktop";
//        String filePath = desktopPath + "/List.csv";
//        String studentHeader = "Student"; // The header you want to read
//        String teacherHeader = "Teacher"; // The header you want to read
//
//        try (Reader reader = new FileReader(filePath);
//             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
//
//            // List of CSV records (each row is a CSVRecord)
//            List<CSVRecord> csvRecords = csvParser.getRecords();
//
//            int recordSize = csvRecords.size();
////            System.out.println(recordSize);
//
//            // Iterate through the records and print the values under the given header
//            for (CSVRecord csvRecord : csvRecords) {
//                String studentNames = csvRecord.get(studentHeader);
//                System.out.println(studentNames);  // Print or process the value under the header
//            }
//
//            for (CSVRecord csvRecord : csvRecords) {
//                String teacherNames = csvRecord.get(teacherHeader);
//                System.out.println(teacherNames);  // Print or process the value under the header
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
