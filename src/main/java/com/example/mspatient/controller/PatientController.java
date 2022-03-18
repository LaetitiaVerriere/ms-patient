package com.example.mspatient.controller;


import com.example.mspatient.model.Patient;
import com.example.mspatient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController

public class PatientController {


    @Autowired
    private PatientService patientService;

    @PostMapping("/patient/add")
    public Patient addPatient(@RequestBody  Patient patient){
        return patientService.createPatient(patient);
    }

    @GetMapping("/patient/get")
    public Iterable<Patient> getPatient(){
        return patientService.getPatient();
    }
    @GetMapping ("/patient/getbyid")
    public  Iterable<Patient> getByIdPatient(long id){
        return patientService.getByIdPatient(id);
    }
}
