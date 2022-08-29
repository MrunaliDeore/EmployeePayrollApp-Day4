package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.entity.Employee;


import java.util.Optional;

public interface IEmployeeService {
    Employee addEmployee(Employee employee);
    Employee editEmployee(Employee employee, int id);

}
