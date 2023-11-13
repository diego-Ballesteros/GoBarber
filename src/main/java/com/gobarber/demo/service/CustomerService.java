package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.CustomerEntity;
import com.gobarber.demo.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerEntity> getAll(){
        return this.customerRepository.findAll();
    }
}
