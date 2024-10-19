package service;

import model.Applicant;
import model.Principal;

public interface ApplicantService {
    void admitApplicant(Applicant applicant, Principal principal);
}
