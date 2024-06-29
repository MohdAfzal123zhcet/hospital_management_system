package com.example.hospital.management.system;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
    public ArrayList<Nurse> getListofnursegreaterthan(int age)
    {
        ArrayList<Nurse>nurse=nurseRepository.getlistbyage(age);
        //logic
        ArrayList<Nurse>n1=new ArrayList<>();
        for(Nurse n:nurse)
            if(n.getAge()>age)
                n1.add(n);
        return n1;
    }


    public ArrayList<Nurse>getNurseByQualification(String qualification)
    {
      ArrayList<Nurse>nurse=nurseRepository.getlistbyqualification(qualification);
      //logic
        ArrayList<Nurse>p=new ArrayList<>();
         for(Nurse n:nurse)
             if(n.getQualification().equals(qualification))
                 p.add(n);
         return p;


    }
}