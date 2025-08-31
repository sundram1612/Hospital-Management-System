package com.fourthSK.HospitalManagement;

import com.fourthSK.HospitalManagement.entity.Patient;
import com.fourthSK.HospitalManagement.repository.PatientRepository;
import com.fourthSK.HospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {

        List<Patient> patientList = patientRepository.findAllPatientWithAppointment();
        System.out.println(patientList);

    }


    @Test
    public void testTransactionMethods() {
//        Patient patient = patientService.getPatientById(1L);
//        Patient patient = patientRepository.findById(1L).orElseThrow(() -> new EntityNotFoundException("Patient notfound with id: 1"));
//        Patient patient = patientRepository.findByName("Priya Prasad");
//        List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(1990, 5, 10), "priya.prasad@example.com");

//        List<Patient> patientList = patientRepository.findByNameContainingOrderByIdDesc("Pri");

//        List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroupType.AB_POSITIVE);

//        List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(2000, 8, 3));
//
//        List<Patient> patientList = patientRepository.findAllPatients();
//
//        for(Patient patient: patientList) {
//            System.out.println(patientList);
//        }

        Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(1,2, Sort.by("name")));

//        for(Patient patient: patientList) {
//            System.out.println(patient);
//        }

//
//        List<Object[]> bloodGroupList = patientRepository.CountEachBloodGroupType();
//        for(Object[] objects: bloodGroupList){
//            System.out.println(objects[0] + " " + objects[1]);
//        }

//        int rowsUpdated = patientRepository.updateNameWithId("Priya Sharma", 4L);
//        System.out.println(rowsUpdated);

//        List<BloodGroupCountResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(BloodGroupCountResponseEntity bloodGroupCountResponse: bloodGroupList){
//            System.out.println(bloodGroupCountResponse);
//        }

    }

}
