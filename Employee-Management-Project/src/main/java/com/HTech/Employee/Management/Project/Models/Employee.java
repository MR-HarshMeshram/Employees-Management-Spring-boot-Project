package com.HTech.Employee.Management.Project.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  int id;
    public  String FirstName;
    public  String LastName;
    public  String Email;
    public  String Address;
    public String description;
    public String jobroll;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String firstName, String lastName, String email, String address, String description, String jobroll) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Address = address;
        this.description = description;
        this.jobroll = jobroll;
    }
    public Employee(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobroll() {
        return jobroll;
    }

    public void setJobroll(String jobroll) {
        this.jobroll = jobroll;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", description='" + description + '\'' +
                ", jobroll='" + jobroll + '\'' +
                '}';
    }
}
