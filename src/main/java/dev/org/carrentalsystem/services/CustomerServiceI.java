package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Customer;

import java.util.List;

public interface CustomerServiceI {
    Customer createCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer getCustomer(Long id);
    List<Customer> getAllCustomers();
}
