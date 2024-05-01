package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeServiceI {
    Employee createEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    Optional<Employee> getEmployee(Long id);
    List<Employee> getAllEmployees();
}
