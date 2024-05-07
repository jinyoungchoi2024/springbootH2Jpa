package org.example.springbooth2jpa.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.springbooth2jpa.entity.Customer;

import java.util.Date;
import java.util.List;

@Mapper
public interface CustomerMapper {

    //@Select("select * from customer")
    //public List<Customer> selectCustomer1111(String name);

    public List<Customer> getCustomerSearchMapper(String name);
}
