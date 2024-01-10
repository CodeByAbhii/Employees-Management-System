package com.employee.Services;

import com.employee.Dto.EmployeeDto;
import com.employee.Entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface EmployeeService {

    public EmployeeDto createEmp(EmployeeDto dto);

    public List<Employee> getALlEmployee();

    public void deleteById( long id);

    public EmployeeDto updateById(long id , EmployeeDto dto);


}
