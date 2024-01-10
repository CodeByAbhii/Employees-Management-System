package com.employee.Services.Impl;

import com.employee.Dto.EmployeeDto;
import com.employee.Entity.Employee;
import com.employee.Services.EmployeeService;
import com.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createEmp(EmployeeDto dto) {

        Employee  emp = new Employee();
        emp.setEmpName(dto.getEmpName());
        emp.setEmpAddress(dto.getEmpAddress());
        emp.setDepartment(dto.getDepartment());
        emp.setWorkingStatus(dto.getWorkingStatus());
        emp.setMobile(dto.getMobile());

        Employee save = employeeRepository.save(emp);

        EmployeeDto empDto  = new EmployeeDto();
        empDto.setEmpName(save.getEmpName());
        empDto.setEmpAddress(save.getEmpAddress());
        empDto.setDepartment(save.getDepartment());
        empDto.setWorkingStatus(save.getWorkingStatus());
        empDto.setMobile(save.getMobile());
        return empDto;
    }

    @Override
    public List<Employee> getALlEmployee() {
        List<Employee> getAll = employeeRepository.findAll();
        return getAll;


    }

    @Override
    public void deleteById( long id) {
        employeeRepository.deleteById(id);
    }
}
