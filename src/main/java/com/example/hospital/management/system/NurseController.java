package com.example.hospital.management.system;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
