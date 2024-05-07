package org.example.springbooth2jpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbooth2jpa.entity.Customer;
import org.example.springbooth2jpa.mapper.CustomerMapper;
import org.example.springbooth2jpa.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public List<Customer> getCustomer(int id) {
        return List.of(customerRepository.findById((long) id).orElse(null));
    }

    @Override
    public Customer postCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById((long) id);
    }

    @Override
    public List<Customer> getCustomerName(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public List<Customer> getCustomerSearchMapper(String name) {
        return customerMapper.getCustomerSearchMapper(name);
    }
}
