package com.example.employeepayrollapp.entity;

import com.example.employeepayrollapp.dto.UserDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class User {

    @Id
        @GeneratedValue
        private int id;
        String firstname;
        String lastname;


        public User(User user) {
            this.firstname = user.firstname;
            this.lastname = user.lastname;
        }

        public User() {

        }

        //user dto constructor created
    public User(UserDTO userDTO) {
        this.firstname = userDTO.firstname;
        this.lastname = userDTO.lastname;
    }

    @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    '}';
        }

        //generate getter and setter for id,firstname,lastname

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getId() {
            return Math.toIntExact(id);
        }

        public void setId(int id) {
            this.id = id;
        }


}
