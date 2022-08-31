package com.example.employeepayrollapp.repository;

import com.example.employeepayrollapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee,Integer> {
}
