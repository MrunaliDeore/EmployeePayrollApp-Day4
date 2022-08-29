package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.entity.Employee;
import com.example.employeepayrollapp.entity.User;
import com.example.employeepayrollapp.service.EmployeeService;
import com.example.employeepayrollapp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    /*
    * get employeee details by id
     */
    @GetMapping("/get/{id}")
    public Optional<User> getById (@PathVariable int id){
        Optional<User> response = employeeService.getById(id);
        return response;
    }

    /**
     * list of all employee
     */
    @GetMapping("/list")
    public List<User> listofAll (){
        List<User> response = employeeService.listAll();
        return response;
    }

    /**
     * delete by ID
     */
    @DeleteMapping ("/emp/{id}")
    public String  deleteUser (@PathVariable int id){
        String response = employeeService.deleteById(id);
        return response;
    }

    /**
     * edit by id
     */
    @PostMapping("/add")
    public Employee createEmployees(@RequestBody Employee employee) {
        return iEmployeeService.addEmployee(employee);
    }
    @Autowired
    IEmployeeService iEmployeeService;

    @PutMapping("update/{id}")
    public Employee editEmployee(@RequestBody Employee employee, @PathVariable int id) {
        return iEmployeeService.editEmployee(employee, id);
    }

}
