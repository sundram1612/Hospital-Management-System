package com.fourthSK.HospitalManagement.service;

import com.fourthSK.HospitalManagement.entity.Patient;
import com.fourthSK.HospitalManagement.repository.PatientRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    private final EntityManager entityManager;

    @Transactional
    public Patient getPatientById(Long id) {
       Patient p1 = patientRepository.findById(id).orElseThrow();

       Patient p2 = patientRepository.findById(id).orElseThrow();
        System.out.println(p1 == p2);
        p1.setName("Paxton");
//        patientRepository.save(p1);
       return p1;
    }

}
