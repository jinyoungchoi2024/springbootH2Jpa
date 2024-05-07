package org.example.springbooth2jpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbooth2jpa.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    //저장
    @PostMapping
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok().body(customerService.postCustomer(customer));
    }

    //조회
    @GetMapping("/{id}")
    public ResponseEntity<List<Customer>> getCustomer(@PathVariable int id){
        return ResponseEntity.ok().body(customerService.getCustomer(id));
    }

    //조회 이름
    @GetMapping
    public ResponseEntity<List<Customer>> getCustomerParam(@RequestParam(required=false) String name){

        System.out.println(name);
        return ResponseEntity.ok().body(customerService.getCustomerName(name));
    }

    //조회 이름
    @GetMapping("/{name}")
    public ResponseEntity<List<Customer>> getCustomer(@PathVariable String name){
        System.out.println(name);
        return ResponseEntity.ok().body(customerService.getCustomerName(name));
    }

    //조회 이름 like
//    @GetMapping("/search")
//    public ResponseEntity<List<Customer>> getCustomerSearch(@RequestParam(required=false) String name){
//        System.out.println(name);
//        return ResponseEntity.ok().body(customerService.getCustomerSearch(name));
//    }

    //조회 이름 like
    @GetMapping("/searchMapper")
    public ResponseEntity<List<Customer>> getCustomerSearchMapper(@RequestParam(required=false) String name){
        System.out.println(name);
        return ResponseEntity.ok().body(customerService.getCustomerSearchMapper(name));
    }

    //삭제
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }

    //수정
    @PutMapping
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok().body(customerService.updateCustomer(customer));
    }
}
