package com.fourthSK.HospitalManagement.dto;

import lombok.Data;

@Data
public class OnboardDoctorRequestDto {

    private Long userId;
    private String specialization;
    private String name;
}
