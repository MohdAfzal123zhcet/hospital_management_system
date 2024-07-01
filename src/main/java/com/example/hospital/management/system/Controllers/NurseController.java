package com.example.hospital.management.system.Controllers;

import com.example.hospital.management.system.Models.Nurse;
import com.example.hospital.management.system.Service.NurseService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    NurseService nurseService=new NurseService();
@PostMapping("/add")
    public String addnurse(@RequestBody Nurse nurse)
{
   String ans=nurseService.addNurse(nurse);
   return ans;
}
@GetMapping("/getbyAge")
    public ArrayList<Nurse> getlistofnursegreaterthanage(@RequestParam("age")Integer age)
    {
        ArrayList<Nurse> nurse=nurseService.getListofnursegreaterthan(age);
        return nurse;

     }
     @GetMapping("/getByQualification")
    public ArrayList<Nurse>getNurseByQualification(@RequestParam("Qualification") String qualification)
     {
         ArrayList<Nurse>n=nurseService.getNurseByQualification(qualification);
                 return n;
     }
}
