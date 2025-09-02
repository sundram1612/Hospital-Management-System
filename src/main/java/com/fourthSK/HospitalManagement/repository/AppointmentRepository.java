package com.fourthSK.HospitalManagement.repository;

import com.fourthSK.HospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    //JpaRepository -----> it is a built-in interface of Spring Data JPA
}
