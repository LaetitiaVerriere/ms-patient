package com.example.mspatient.controller;


import com.example.mspatient.model.Patient;
import com.example.mspatient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    PatientService patientService;


    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }

    @GetMapping
    public Patient getPatientById(@RequestParam(name = "id") Integer id) {
        return this.patientService.findPatientById(id);
    }

    @PutMapping
    public void updatePatient(@RequestParam(name = "id") Integer id, @RequestBody Patient patient) {
        patientService.updatePatient(patient, id);
    }

    @DeleteMapping
    public void deletePatient(@RequestParam(name = "id") Integer id) {
        patientService.deletePatient(id);
    }

    @GetMapping("/getAll")
    public List<Patient> patientsgetAllPatients() {
        return patientService.findAllPatients();
    }

}

//@RestController
//
//public class PatientController {
//
//
//    @Autowired
//    private PatientService patientService;
//
//    @PostMapping("/patient/add")
//    public Patient addPatient(@RequestBody  Patient patient){
//        return patientService.createPatient(patient);
//    }
//
//    @GetMapping("/patient/getAll")
//    public Iterable<Patient> getPatient(){
//        return patientService.getPatient();
//    }
//
//    @GetMapping
//    public Patient getPatientById(@RequestParam(name = "id") int id) {
//        return this.patientService.findPatientById(id);
//    }
//
//    @PostMapping
//    public void updatePatient(@RequestParam(name = "id") Integer id, @RequestBody Patient patient) {
//        patientService.updatePatient(patient, id);
//    }
//
//    @DeleteMapping
//    public void deletePatient(@RequestParam(name = "id") Integer id) {
//        patientService.deletePatient(id);
//    }
//
////    @GetMapping("/patient/getAll")
////    public List<Patient> patientsgetAllPatients() {
////        return patientService.findAllPatients();
////    }
//}
