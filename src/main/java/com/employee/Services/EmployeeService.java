package com.employee.Services;

import com.employee.Dto.EmployeeDto;
import com.employee.Entity.Employee;

public interface EmployeeService {

    public Employee createEmp(EmployeeDto dto);
}
