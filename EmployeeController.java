package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.dto.ResponseDTO;
import com.example.employeepayrollapp.entity.Employee;
import com.example.employeepayrollapp.entity.User;
import com.example.employeepayrollapp.service.EmployeeService;
import com.example.employeepayrollapp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
     * add emp
     */
    @PostMapping("/add")
    public Employee createEmployees(@RequestBody Employee employee) {
        return iEmployeeService.addEmployee(employee);
    }

    /**
     * list of all emp
     */
    @GetMapping("/get-all")
    public List<Employee> getAllEmployees() {
        return iEmployeeService.getAllEmployees();
    }

    /**
     * delete by id
     */
    @DeleteMapping("delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return iEmployeeService.deleteById(id);
    }
    @Autowired
    IEmployeeService iEmployeeService;

    /**
     *update by id
     */
    @PutMapping("update/{id}")
    public Employee editEmployee(@RequestBody Employee employee, @PathVariable int id) {
        return iEmployeeService.editEmployee(employee, id);
    }

    /**
     * DTO
     * create emp record
     */
    @PostMapping("/post")
    public ResponseEntity<ResponseDTO> createEmployees(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee1 = new Employee(employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Employee Created Successfully", iEmployeeService.addEmployee(employee1));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
    /**
     * DTO
     * List of all emp
     */
    @GetMapping("/listofall")
    public ResponseEntity<ResponseDTO> getAllEmployee() {
        ResponseDTO responseDTO = new ResponseDTO("Employee List Received Successfully", iEmployeeService.getAllEmployees());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    /**
     * DTO
     * delete by id
     */
    @DeleteMapping("dtodelete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployees(@PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("Employee Deleted Successfully", iEmployeeService.deleteById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    
}
