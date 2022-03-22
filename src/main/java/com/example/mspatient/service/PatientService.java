package com.example.mspatient.service;


import com.example.mspatient.model.Patient;
import com.example.mspatient.repository.PatientRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("PatientService")
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    public Patient createPatient(Patient patient) {

        return patientRepository.save(patient);
    }

    public List<Patient> findAllPatients() {
        Iterable<Patient> patients = patientRepository.findAll();
        List<Patient> result = new ArrayList<>();
        patients.forEach(result::add);
        return result;

    }

    public Patient findPatientById(Integer id) {
        return patientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid patient Id:" + id));
    }

    public Patient updatePatient(Patient patient, Integer id) {
        patient.setId(id);
        return patientRepository.save(patient);
    }
    public void deletePatient(Integer id){
        Patient patient = patientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid patient Id:" + id));
        patientRepository.delete(patient);
    }

}
//@Data
//@Service
//public class PatientService {
//
//    @Autowired
//    private PatientRepository patientRepository;
//
//    public Optional<Patient> getPatient(int id){
//        return patientRepository.findById((long) id);
//    }
//
//    public Iterable<Patient> getPatient(){
//        return patientRepository.findAll();
//
//    }
//
//    public List<Patient> findAllPatients() {
//        Iterable<Patient> patients = patientRepository.findAll();
//        List<Patient> result = new ArrayList<>();
//        patients.forEach(result::add);
//        return result;
//
//    }
//
//    public Patient findPatientById(Integer id) {
//        return patientRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid patient Id:" + id));
//    }
//
//    public Patient updatePatient(Patient patient, Integer id) {
//        patient.setId(id);
//        return patientRepository.save(patient);
//    }
//    public void deletePatient(Integer id){
//        Patient patient = patientRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid patient Id:" + id));
//        patientRepository.delete(patient);
//    }
//
//
//
//    public Patient createPatient(Patient patient){
//        return patientRepository.save(patient);
//
//    }
//
//
//
//
//}
