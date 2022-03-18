package com.example.mspatient.model;
import javax.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table ( name = "patient")
public class Patient {

        @Id
        @GeneratedValue
        @Column(name = "patient_id")
        private Integer id;


        @Column(name = "firstname")
        private String firstname;

        @Column(name = "lastname")
        private String lastname;
        @Column(name = "address")
        private  String address;
        @Column(name = "phone")
        private String phone;
        @Column(name = "gender")
        private String gender;
        @Column(name = "birthday")
        private LocalDate birthdate;

    public Patient(Integer id, String firstname, String lastname, LocalDate birthdate, String gender, String address, String phone){
        id = this.id;
        firstname = this.firstname;
        lastname = this.lastname;
        birthdate = this.birthdate;
        gender = this.gender;
        address = this.address;
        phone  =this.phone;
    }

    public Patient() {
    }


}
