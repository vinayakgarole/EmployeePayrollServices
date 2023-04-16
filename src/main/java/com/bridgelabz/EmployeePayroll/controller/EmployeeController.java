package com.bridgelabz.EmployeePayroll.controller;

import com.bridgelabz.EmployeePayroll.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayroll.model.EmployeeData;
import com.bridgelabz.EmployeePayroll.services.IEmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeServices iEmployeeServices;

    @PostMapping("/add")
    public EmployeeData addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeData empData = iEmployeeServices.addEmployee(employeeDTO);
        return empData;
    }
}
