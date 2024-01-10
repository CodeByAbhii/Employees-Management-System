package com.employee.Controller;

import com.employee.Dto.EmployeeDto;
import com.employee.Entity.Employee;
import com.employee.Services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {


    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping
    private ResponseEntity<?> creareEmp(@RequestBody EmployeeDto dto){
        Employee emp = employeeService.createEmp(dto);
        return new ResponseEntity<>(emp , HttpStatus.CREATED);
    }
}
