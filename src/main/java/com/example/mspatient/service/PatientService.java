package com.example.mspatient.service;


import com.example.mspatient.model.Patient;
import com.example.mspatient.repository.PatientRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Optional<Patient> getPatient(final Long id){
        return patientRepository.findById(id);
    }

    public Iterable<Patient> getPatient(){
        return patientRepository.findAll();

    }

//    public Iterable<Patient> getByIdPatient(final Long id){
//        return patientRepository.findById(id);
//    }

    public void deletePatient(final Long id){
        patientRepository.deleteById(id);
    }


    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);

    }
//getbyID



}
