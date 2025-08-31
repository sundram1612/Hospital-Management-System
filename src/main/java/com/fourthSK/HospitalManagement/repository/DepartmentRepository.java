package com.fourthSK.HospitalManagement.repository;

import com.fourthSK.HospitalManagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
