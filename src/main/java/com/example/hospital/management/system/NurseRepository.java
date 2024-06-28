package com.example.hospital.management.system;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class NurseRepository {

    //this is a class that will contain the data base(hashmap,mysql);
    HashMap<Integer,Nurse>hashmap=new HashMap<>();
    public String addNurse(Nurse nurse)
    {
      int key=nurse.getNurseid();
      hashmap.put(key,nurse);
      return "nurse added sucessfully";

    }
}
