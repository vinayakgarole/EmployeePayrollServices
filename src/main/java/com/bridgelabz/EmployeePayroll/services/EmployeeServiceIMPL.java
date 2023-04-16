package com.bridgelabz.EmployeePayroll.services;

import com.bridgelabz.EmployeePayroll.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayroll.model.EmployeeData;
import com.bridgelabz.EmployeePayroll.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceIMPL implements IEmployeeServices {

    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public EmployeeData addEmployee(EmployeeDTO employeeDTO) {
        EmployeeData empData = new EmployeeData(employeeDTO);
        return empRepo.save(empData);
    }
}