package com.employee.Controller;

import com.employee.Dto.EmployeeDto;
import com.employee.Entity.Employee;
import com.employee.Services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {


    //http://localhost:8080/api/employee
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

      //http://localhost:8080/api/employee
    @PostMapping
    private ResponseEntity<?> createEmp(@RequestBody EmployeeDto dto){
        EmployeeDto emp = employeeService.createEmp(dto);
        return new ResponseEntity<>(emp , HttpStatus.CREATED);
    }

    //http://localhost:8080/api/employee
    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        List<Employee> employees = employeeService.getALlEmployee();
        return ResponseEntity.ok().body(employees);
    }


    //http://localhost:8080/api/employee/{id}
    @GetMapping("/{id}")
    public  ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable long id){
        EmployeeDto employeeById = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employeeById ,HttpStatus.OK);

    }

    //http://localhost:8080/api/employee/{id}
    @DeleteMapping("/{id}")
    public  ResponseEntity<?>deleteById(@PathVariable long id){
        employeeService.deleteById(id);
        return  new ResponseEntity<>("Record is deleted!!" , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //http://localhost:8080/api/employee?id=31
    @PutMapping
    public ResponseEntity<?> updateRecord(@RequestParam long id , EmployeeDto dto){
        EmployeeDto employee = employeeService.updateById(id, dto);
        return new ResponseEntity<>(employee , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
