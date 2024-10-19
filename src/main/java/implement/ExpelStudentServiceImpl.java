package implement;

import model.Principal;
import model.Student;
import service.ExpelStudentService;

public class ExpelStudentServiceImpl implements ExpelStudentService {
    @Override
    public void expelStudent(Student student, Principal principal) {
        System.out.println("Student " + student.getName() + ", has been expelled by " + principal.getName() +
                " the Principal");
    }
}
