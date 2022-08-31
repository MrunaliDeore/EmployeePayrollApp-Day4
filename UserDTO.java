package com.example.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Pattern;
@Data
@AllArgsConstructor
public class UserDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee first name is Invalid")
    public String firstname;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = " Employee last name is Invalid")
    public String lastname;
}
