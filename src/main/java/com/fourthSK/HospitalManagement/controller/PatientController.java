package com.fourthSK.HospitalManagement.controller;


import com.fourthSK.HospitalManagement.dto.AppointmentResponseDto;
import com.fourthSK.HospitalManagement.dto.CreateAppointmentRequestDto;
import com.fourthSK.HospitalManagement.entity.Patient;
import com.fourthSK.HospitalManagement.service.AppointmentService;
import com.fourthSK.HospitalManagement.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;
    private final AppointmentService appointmentService;

    @PostMapping("/appointments")
    public ResponseEntity<AppointmentResponseDto> createNewAppointment(@RequestBody CreateAppointmentRequestDto createAppointmentRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.createNewAppointment(createAppointmentRequestDto));
    }

    @GetMapping("/profile")
    private ResponseEntity<Patient> getPatientProfile() {       //<PatientResponseDto> changed ----> <Patient>
        Long patientId = 4L;
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }
}
