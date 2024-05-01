package dev.org.carrentalsystem.repositories;

import dev.org.carrentalsystem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Override
    Employee save(Employee employee);
}
