package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Customer;

public interface CustomerService {
    void createCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer getCustomer(Long id);
}
