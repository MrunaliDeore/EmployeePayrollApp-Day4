package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.entity.User;
import com.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    /**
     * UC1
     * print simple welcome message from the curl
     */
    public static String getMessage() {
        return "Hello Welcome to the Employee PayRoll App...!";
    }
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * UC2
     * create data save int table
     */
    public User saveEmp(User user){
//        User newuser = new User(user);
        employeeRepository.save(user);
        return user;
    }

    /**
     * find employee details by id
     */
    public Optional<User> getById(int id) {
        return employeeRepository.findById(id);
    }

    /**
     * list of  employee
     * @return
     */
    public List<User> listAll(){
        return employeeRepository.findAll();

    }

    /**
     * delete by id
     */
    public String deleteById(int id) {
        employeeRepository.deleteById(id);
        return "User by id "+id+" is Deleted";
    }
}
