package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.CustomerEntity;
import com.gobarber.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gobarber/customers")
public class CustomerController {
    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping()
    public ResponseEntity<List<CustomerEntity>> getAll(){
        return ResponseEntity.ok(this.customerService.getAll());
    }
}
