package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeServiceI {
    Employee createEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee getEmployee(Long id);
    List<Employee> getAllEmployees();
}
