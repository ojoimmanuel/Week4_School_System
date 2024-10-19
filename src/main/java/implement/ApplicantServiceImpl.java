package implement;

import model.Applicant;
import model.Principal;
import service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {
    @Override
    public void admitApplicant(Applicant applicant, Principal principal) {
        if (applicant.getAge() >= 10){
            System.out.println(principal.getName() + " the principal, will admit " + applicant.getName() +
                    ", because age requirement is fulfilled.");
        } else {
            System.out.println(principal.getName() + " the principal will NOT admit " + applicant.getName() +
                    ", because age requirement is not fulfilled.");
        }
    }
}
