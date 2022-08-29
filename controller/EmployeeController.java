package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    /**
     * UC1
     * Create a Employee Payroll Spring Project to cater to REST Request from Employee Payroll
     * pass in url - localhost:8080/welcomemsg
     */
    @GetMapping("/welcomemsg")
    public String getMessage() {
        return EmployeeService.getMessage();
    }
}
