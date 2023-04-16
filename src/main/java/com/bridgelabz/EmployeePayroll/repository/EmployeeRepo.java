package com.bridgelabz.EmployeePayroll.repository;

import com.bridgelabz.EmployeePayroll.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeData, Integer> {
}
