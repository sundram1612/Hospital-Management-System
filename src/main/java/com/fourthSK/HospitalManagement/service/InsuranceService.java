package com.fourthSK.HospitalManagement.service;

import com.fourthSK.HospitalManagement.entity.Insurance;
import com.fourthSK.HospitalManagement.entity.Patient;
import com.fourthSK.HospitalManagement.repository.InsuranceRepository;
import com.fourthSK.HospitalManagement.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient is not found with ID: "+patientId));

        patient.setInsurance(insurance);

        insurance.setPatient(patient);      // to maintain bidirectional consistency

        return patient;
    }

    @Transactional
    public Patient disAssociateInsuranceFromPatient(Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient is not found with id: "+patientId));

        patient.setInsurance(null);

        return patient;
    }
}
