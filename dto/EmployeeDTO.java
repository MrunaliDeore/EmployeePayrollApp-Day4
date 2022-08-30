package com.example.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
        public String fullName;
        public String gender;
        public String department;
        public int salary;
        public String mobileNumber;
        public LocalDate startDate;
}
