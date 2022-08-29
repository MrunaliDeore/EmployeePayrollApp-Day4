package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.entity.User;
import com.example.employeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired
    private EmployeeService employeeService;
    /**
     * UC2
     * Create a Rest Controller to demonstrate the various HTTP Methods
     */
    @PostMapping("/create")
    public User saveEmpData (@RequestBody User user){
        User newuser = employeeService.saveEmp(user);
        return newuser;
    }
}
