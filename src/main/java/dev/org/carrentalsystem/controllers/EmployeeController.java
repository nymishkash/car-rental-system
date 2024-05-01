package dev.org.carrentalsystem.controllers;

import dev.org.carrentalsystem.models.Employee;
import dev.org.carrentalsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }
}
