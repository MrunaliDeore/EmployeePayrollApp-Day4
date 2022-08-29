package com.example.employeepayrollapp.entity;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "emptable")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String fullName;
    public String gender;
    public String department;
    public int salary;
    public String mobileNumber;
    public LocalDate startDate;

    public Employee(int id, Employee employee) {
        this.id = id;
        this.fullName = employee.fullName;
        this.gender = employee.gender;
        this.department = employee.department;
        this.mobileNumber = employee.mobileNumber;
        this.salary = employee.salary;
        this.startDate = employee.startDate;
    }
}
