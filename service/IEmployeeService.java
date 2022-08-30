package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.entity.Employee;


import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();

    String deleteById(int id);
    Employee editEmployee(Employee employee, int id);

}
