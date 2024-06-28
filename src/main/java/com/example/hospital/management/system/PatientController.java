package com.example.hospital.management.system;

import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/patient")
public class PatientController
{
    HashMap<Integer,Patient>patientDb=new HashMap<>();

@PostMapping("/addPatient")
public String addPatient(@RequestParam("patientId")Integer PatientId, @RequestParam("name")String name,@RequestParam("disease")String disease,@RequestParam("age")Integer age)
{
Patient patient=new Patient(PatientId,name,disease,age);
        patientDb.put(PatientId,patient);
        return "patient added successfully";
}




@PostMapping("/addpatientInfoViaRequestBody")
public String addpatient(@RequestBody Patient patient)
{
   int key=patient.getPatientId();
   patientDb.put(key,patient);
   return "patient added successfully via request body";
}



@GetMapping("/getpatientinfoviaPathVariable/{PatientId}")
public Patient getpatientinfo(@PathVariable("PatientId")Integer PatientId)
{
Patient Pa;
Pa=patientDb.get(PatientId);
return Pa;
}



@PutMapping("/updatepatientdisease")
public String updatedisease(@RequestParam("patientid")Integer PatientId,@RequestParam("disease")String disease)
{
if(patientDb.containsKey(PatientId))
{
Patient p=patientDb.get(PatientId);
p.setDisease(disease);
patientDb.put(PatientId, p);
return "updated disease successfully";
}
else
return "patient not exist";
}



@PutMapping("/updatePatient")
public String updatepatient(@RequestBody Patient patient)
{
int key;
key=patient.getPatientId();
if(patientDb.containsKey(key))
{
patientDb.put(key,patient);
return "patient updated successfully";
}
else
return "patient not exist ";

}

@DeleteMapping("/deletepatient")
public String deletepatient(@RequestParam("patientid") Integer PatientId)
{
patientDb.remove(PatientId);
return "patient discharge sucessfully";
}






@GetMapping("/getPatientinfoviaPathVariablewhereageGreaterthanageanddiseaseCOLD/{age}/{disease}")
public ArrayList<Patient> getPatientinfowhereageGreaterthanageanddiseaseCold(@PathVariable("age")Integer age,@PathVariable("disease")String disease)
{
ArrayList<Patient> pat=new ArrayList<>();

for(Patient pati:patientDb.values())
{
    if (pati.getAge()>age && pati.getDisease().equals(disease))
     {
        pat.add(pati);
        
    }
}
return pat;
}

    @GetMapping("/getpatientInfo")
    public Patient getpatient(@RequestParam("PatientId")Integer PatientId) {
    Patient patient;
    patient=patientDb.get(PatientId);
    return patient;
}


@GetMapping("/getAllPatient")
    public ArrayList<Patient>getAllPatient()
{
  ArrayList<Patient>patients=new ArrayList<>() ;
  for(Patient p:patientDb.values())
      patients.add(p);
  return patients;
}
@GetMapping("/getPatientByName")
    public Patient getPatientBytName(@RequestParam("name")String name)
{
    for(Patient p1:patientDb.values())
    {
      if(p1.getName().equals(name)) {
          return p1;
      }
    }
    return null;
}
@GetMapping("/GetPatientListGreaterthanAge")
    public ArrayList<Patient> GetPatientListGreaterthanAge(@RequestParam("age")Integer age)
{
    ArrayList<Patient>patients=new ArrayList<>() ;
    for(Patient p:patientDb.values())
    {
        if(p.getAge()>age) {
            patients.add(p);
        }
    }
    return patients;

}
}
