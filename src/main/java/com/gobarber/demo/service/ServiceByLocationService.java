package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.ServicesByLocationEntity;
import com.gobarber.demo.persistence.repository.ServiceByLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceByLocationService {

    private final ServiceByLocationRepository serviceByLocationRepository;
    @Autowired
    public ServiceByLocationService(ServiceByLocationRepository serviceByLocationRepository) {
        this.serviceByLocationRepository = serviceByLocationRepository;
    }

    public List<ServicesByLocationEntity> getAll(){
        return this.serviceByLocationRepository.findAll();
    }
}
