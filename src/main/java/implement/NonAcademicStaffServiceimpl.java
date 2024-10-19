package implement;

import model.NonAcademicStaff;
import service.NonAcademicStaffService;

public class NonAcademicStaffServiceimpl implements NonAcademicStaffService {
    @Override
    public void display(NonAcademicStaff nonAcademicStaff) {
        System.out.println(nonAcademicStaff.getName() + ", age " + nonAcademicStaff.getAge() +  ", is a " +
                nonAcademicStaff.getGender() + " non-academic staff member");
    }
}
