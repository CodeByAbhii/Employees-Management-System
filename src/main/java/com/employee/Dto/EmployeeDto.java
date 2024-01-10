package com.employee.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private long empId;
    private String empName;
    private String empAddress;
    private String Department;
    private Boolean workingStatus;
    private long mobile;
}
