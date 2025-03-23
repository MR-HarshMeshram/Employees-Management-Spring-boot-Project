package com.HTech.Employee.Management.Project.Services;

import com.HTech.Employee.Management.Project.Models.Employee;
import com.HTech.Employee.Management.Project.Repository.EmployeesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    EmployeesRepository employeesRepository;
    public List<Employee> GetEmployees(){
        return employeesRepository.findAll();
    }
    public void PostEmployees(Employee employee){
        employeesRepository.save(employee);
    }
    public Employee GetIdEmployee(int id){
        return employeesRepository.findById(id).orElse(new Employee());
    }
    public void deleteEmployee(int id) {
        employeesRepository.deleteById(id);
    }
    public void updateEmployeeByName(int id, Employee updatedEmployeeData) {
        Employee employee = employeesRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));

        // Update fields
        employee.setEmail(updatedEmployeeData.getEmail());
        employee.setDescription(updatedEmployeeData.getDescription());
        employee.setJobroll(updatedEmployeeData.getJobroll());
        employee.setLastName(updatedEmployeeData.getLastName());
        employee.setFirstName(updatedEmployeeData.getFirstName());
        employee.setAddress(updatedEmployeeData.getAddress());

        // Save the updated entity
        employeesRepository.save(employee);
    }
}
