package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.entity.Employee;
import com.example.employeepayrollapp.entity.User;
import com.example.employeepayrollapp.exception.CustomException;
import com.example.employeepayrollapp.repository.EmpRepository;
import com.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    /**
     * UC1
     * print simple welcome message from the curl
     */
    public static String getMessage() {
        return "Hello Welcome to the Employee PayRoll App...!";
    }

    @Autowired
    EmployeeRepository employeeRepository;

    /**
     * UC2
     * create data save int table
     */
    public User saveEmp(User user) {
//        User newuser = new User(user);
        employeeRepository.save(user);
        return user;
    }

    /**
     * find employee details by id
     */
    public User getById(int id) {
        return listAll().stream()
                .filter(User->User.getId()==id)
                .findFirst()
                .orElseThrow(()->new CustomException("Employee ID not found exception..!"));
//        return employeeRepository.findById(id);
    }

    /**
     * list of  employee
     *
     * @return
     */
    public List<User> listAll() {
        return employeeRepository.findAll();

    }

    /**
     * delete by id
     */
    public String deleteById(int id) {
        employeeRepository.deleteById(id);
        return "User by id " + id + " is Deleted";
    }

    /**
     *add emp
     */
    public Employee addEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    /**
     * list of all emp
     */
    public List<Employee> getAllEmployees() {

        return empRepository.findAll();
    }

    /**
     * delete by id
     */
    public String deleteByyId(int id) {
        if (empRepository.findById(id).isPresent()) {
            empRepository.deleteById(id);
            return "Employee ID: " + id + " is Deleted Successfully!!";
        } return  null;
    }
    @Autowired
    EmpRepository empRepository;

    /**
     * update by id
     */
    public Employee editEmployee(Employee employee, int id) {
        if (empRepository.findById(id).isPresent()) {
            Employee newemp = new Employee(id, employee);
            return empRepository.save(newemp);
        }
        return null;
    }

    /**
     * create user
     */
    public User addUser(User user) {
        return employeeRepository.save(user);
    }

    /**
     * exception error
     * show user data of specific id
     */

}
