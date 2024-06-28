package com.example.hospital.management.system;


import org.springframework.stereotype.Service;

@Service
public class NurseService {
    NurseRepository nurseRepository = new NurseRepository();

    public String addNurse(Nurse nurse) {
        //logic and validations
        if (nurse.getNurseid() < 0)
            return "enter valid nurseid";
        else {
            String ans = nurseRepository.addNurse(nurse);
            return ans;
        }
    }
}