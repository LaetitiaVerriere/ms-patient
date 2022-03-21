package com.example.mspatient;

import com.example.mspatient.model.Patient;
import com.example.mspatient.repository.PatientRepository;
import com.example.mspatient.service.PatientService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;


import java.util.Optional;

@SpringBootTest
class MsPatientApplicationTests {


	private static PatientRepository patientRepository = new PatientRepository() {
		@Override
		public <S extends Patient> S save(S entity) {
			return null;
		}

		@Override
		public <S extends Patient> Iterable<S> saveAll(Iterable<S> entities) {
			return null;
		}

		@Override
		public Optional<Patient> findById(Integer integer) {
			return Optional.empty();
		}

		@Override
		public boolean existsById(Integer integer) {
			return false;
		}

		@Override
		public Iterable<Patient> findAll() {
			return null;
		}

		@Override
		public Iterable<Patient> findAllById(Iterable<Integer> integers) {
			return null;
		}

		@Override
		public long count() {
			return 0;
		}

		@Override
		public void deleteById(Integer integer) {

		}

		@Override
		public void delete(Patient entity) {

		}

		@Override
		public void deleteAllById(Iterable<? extends Integer> integers) {

		}

		@Override
		public void deleteAll(Iterable<? extends Patient> entities) {

		}

		@Override
		public void deleteAll() {

		}
	};
	private static PatientService patientService = new PatientService(patientRepository);


	@Test
	void contextLoads() {
	}

	@Test
	void createPatientTest(){
//		Integer id, String firstname, String lastname, LocalDate birthdate, String gender, String address, String phone
		Patient patient = patientService.createPatient(new Patient(15, "laeti", "verri",LocalDate.parse("1984-12-11"), "femme", "adresse paumee", "0655445544"));

	}
}
