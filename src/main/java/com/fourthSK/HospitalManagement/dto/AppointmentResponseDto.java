package com.fourthSK.HospitalManagement.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentResponseDto {
    private Long id;
    private LocalDateTime appointmentsTime;
    private String reason;
    private DoctorResponseDto doctor;
//    private DoctorResponseDto patient;
}
