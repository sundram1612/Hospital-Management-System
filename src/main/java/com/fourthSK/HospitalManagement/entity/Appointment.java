package com.fourthSK.HospitalManagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;

    @ManyToOne                         // Owning Side
    @ToString.Exclude
    @JoinColumn(name = "patient_id", nullable = false)              // patient is required field and can't be nullable
    private Patient patient;                                        // Many appointment to one patient;

    @ManyToOne(fetch = FetchType.LAZY)                      // for performance optimization
    @ToString.Exclude
    @JoinColumn(nullable = false)
    private Doctor doctor;
}


//just try to create 3 appointments assign them to one patient and then try to delete that patient