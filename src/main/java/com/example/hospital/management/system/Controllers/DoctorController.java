package com.example.hospital.management.system.Controllers;

import com.example.hospital.management.system.Models.Doctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
@RequestMapping("/doctor")
public class DoctorController {

    HashMap<Integer, Doctor>hashmap=new HashMap<>();
    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor)
        {
           int key=doctor.getDoctorid();
           hashmap.put(key,doctor);
           return "doctor added successfully";

        }





}
