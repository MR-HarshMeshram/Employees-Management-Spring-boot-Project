package com.HTech.Employee.Management.Project.Repository;

import com.HTech.Employee.Management.Project.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee,Integer> {
//    Employee findByName(String name);
}
