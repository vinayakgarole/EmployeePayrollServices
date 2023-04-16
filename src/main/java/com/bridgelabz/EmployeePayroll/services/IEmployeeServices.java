package com.bridgelabz.EmployeePayroll.services;

import com.bridgelabz.EmployeePayroll.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayroll.model.EmployeeData;

public interface IEmployeeServices {

    EmployeeData addEmployee(EmployeeDTO employeeDTO);
}
