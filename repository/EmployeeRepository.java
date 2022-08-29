package com.example.employeepayrollapp.repository;


import com.example.employeepayrollapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<User, Integer> {
}
