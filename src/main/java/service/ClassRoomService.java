package service;

import model.ClassRoom;
import model.Student;
import model.Teacher;

public interface ClassRoomService {

    void studentClass (Student student, ClassRoom classRoom);

    void takeClass (Teacher teacher, ClassRoom classRoom);
}
