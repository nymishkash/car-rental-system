package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Employee;
import dev.org.carrentalsystem.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceI{

    EmployeeRepository employeeRepo;
    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employeeRepo.save(employee);
        return employee;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public Employee getEmployee(Long id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }
}
