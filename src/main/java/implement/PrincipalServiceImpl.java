package implement;

import enums.Gender;
import model.Principal;
import service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public void display(Principal principal) {
        String Gender;
        System.out.println("Principal's name is " + principal.getName() + ", a " + principal.getAge() + "-year-old "
                + principal.getGender());
    }
}
