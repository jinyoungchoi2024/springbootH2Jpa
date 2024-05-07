package org.example.springbooth2jpa.controller;

import org.example.springbooth2jpa.entity.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService {

    public List<Customer> findAll();
    public List<Customer> getCustomer(int id);

    public Customer postCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public void deleteCustomer(int id);


    List<Customer> getCustomerName(String name);
    List<Customer> getCustomerSearchMapper(String name);
}
