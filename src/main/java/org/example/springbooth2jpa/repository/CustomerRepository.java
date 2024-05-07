package org.example.springbooth2jpa.repository;

import org.example.springbooth2jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);
    List<Customer> findByNameLike(String name);
    List<Customer> findByNameLikeOrderByAddressDesc(String name);
    List<Customer> findByNameAndAddress(String name,String address);

}
