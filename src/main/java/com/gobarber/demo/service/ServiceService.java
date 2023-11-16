package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.ServiceEntity;
import com.gobarber.demo.persistence.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    private final ServiceRepository serviceRepository;
    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<ServiceEntity> getAll(){
        return this.serviceRepository.findAll();
    }
}
