package dev.org.carrentalsystem.repositories;

import dev.org.carrentalsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Override
    Customer save(Customer customer);

    @Override
    Optional<Customer> findById(Long id);

    @Override
    void delete(Customer customer);

    @Override
    void deleteById(Long id);

}
