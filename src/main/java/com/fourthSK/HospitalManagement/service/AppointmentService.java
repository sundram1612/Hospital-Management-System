package com.fourthSK.HospitalManagement.service;

import com.fourthSK.HospitalManagement.entity.Appointment;
import com.fourthSK.HospitalManagement.entity.Doctor;
import com.fourthSK.HospitalManagement.entity.Patient;
import com.fourthSK.HospitalManagement.repository.AppointmentRepository;
import com.fourthSK.HospitalManagement.repository.DoctorRepository;
import com.fourthSK.HospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorId, Long patientId) {
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        if(appointment.getId() != null) throw new IllegalArgumentException("Appointment should not have given Id.");

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        patient.getAppointments().add(appointment);     //to maintain bidirectional consistency

        return appointmentRepository.save(appointment);
    }

    @Transactional
    public Appointment reAssignAppointmentToAnotherDoctor(Long appointmentId, Long doctorId){
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setDoctor(doctor);                  // this will automatically call the update, because it is dirty now.

        doctor.getAppointments().add(appointment);      // to maintain bidirectional consistency

        return appointment;
    }
}
