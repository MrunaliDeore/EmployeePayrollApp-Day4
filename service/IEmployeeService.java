package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.entity.Employee;
import com.example.employeepayrollapp.entity.User;


import java.util.List;

public interface IEmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();

    String deleteById(int id);
    Employee editEmployee(Employee employee, int id);

    //create user obj
    User addUser(User user);

}
