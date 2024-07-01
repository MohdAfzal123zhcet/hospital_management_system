package com.example.hospital.management.system.Repository;

import com.example.hospital.management.system.Models.Nurse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
@Repository
public class NurseRepository {

    //this is a class that will contain the data base(hashmap,mysql);
    HashMap<Integer, Nurse>hashmap=new HashMap<>();
    public String addNurse(Nurse nurse)
    {
      int key=nurse.getNurseid();
      hashmap.put(key,nurse);
      return "nurse added sucessfully";

    }

    public ArrayList<Nurse> getlistbyage(int age)
    {
        ArrayList<Nurse>p2=new ArrayList<>();
        for(Nurse n:hashmap.values()) {
            p2.add(n);
        }
        return p2;
    }
    public ArrayList<Nurse> getlistbyqualification(String qualification)
    {
        ArrayList<Nurse>p2=new ArrayList<>();
        for(Nurse n:hashmap.values()) {
            p2.add(n);
        }
        return p2;

    }
}
