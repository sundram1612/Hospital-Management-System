package com.fourthSK.HospitalManagement;

import com.fourthSK.HospitalManagement.entity.Appointment;
import com.fourthSK.HospitalManagement.entity.Insurance;
import com.fourthSK.HospitalManagement.entity.Patient;
import com.fourthSK.HospitalManagement.service.AppointmentService;
import com.fourthSK.HospitalManagement.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTests {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testInsurance() {
        Insurance insurance = Insurance.builder()
                .policyNumber("HDFC_1234")
                .provider("HDFC")
                .validUntil(LocalDate.of(2030,10,12))
                .build();

        Patient patient = insuranceService.assignInsuranceToPatient(insurance, 4L);

        System.out.println(patient);

        var newPatient = insuranceService.disAssociateInsuranceFromPatient(patient.getId());
        System.out.println(newPatient);
    }

    @Test
    public void testCreateAppointment()
    {
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025, 8, 30, 13, 8))
                .reason("Cancer")
                .build();

        var newAppointment = appointmentService.createNewAppointment(appointment, 1L, 2L);
        System.out.println(newAppointment);

        var updatedAppointment = appointmentService.reAssignAppointmentToAnotherDoctor(newAppointment.getId(), 3L);

        System.out.println(updatedAppointment);
    }
}
