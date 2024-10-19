package implement;

import model.ClassRoom;
import model.Student;
import model.Teacher;
import service.ClassRoomService;

public class ClassRoomServiceImpl implements ClassRoomService {
    @Override
    public void studentClass(Student student, ClassRoom classRoom) {
        System.out.println(student.getName() + " is a member of " + classRoom.getClas());

    }

    @Override
    public void takeClass(Teacher teacher, ClassRoom classRoom) {
        System.out.println(teacher.getName() + " teaches in " + classRoom.getClas());
    }
}
