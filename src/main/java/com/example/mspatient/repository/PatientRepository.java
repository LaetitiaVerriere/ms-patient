package com.example.mspatient.repository;

import com.example.mspatient.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface PatientRepository extends CrudRepository<Patient, Integer>{

    }


