package com.HTech.Employee.Management.Project.Controllers;

import com.HTech.Employee.Management.Project.Models.Employee;
import com.HTech.Employee.Management.Project.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class EmployeeControllers {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> Greet(){
        return employeeService.GetEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee GetIdemployee(@PathVariable int id){
        return employeeService.GetIdEmployee(id);
    }
    @PostMapping("/addemployee")
    public  void PostEmployee(@RequestBody Employee employee){
        System.out.println(employee);
         employeeService.PostEmployees(employee);
    }
    @PutMapping("/updateemployee/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Employee updatedemployee) {
        employeeService.updateEmployeeByName(id, updatedemployee);
    }

    @DeleteMapping("/deleteemployee/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }

}
