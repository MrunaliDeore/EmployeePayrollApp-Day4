package com.example.employeepayrollapp.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    /**
     * UC1
     * print simple welcome message from the curl
     */
    public static String getMessage() {
        return "Hello Welcome to the Employee PayRoll App...!";
    }
}
