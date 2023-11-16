package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.ServiceEntity;
import com.gobarber.demo.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    private final ServiceService serviceService;
    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    public ResponseEntity<List<ServiceEntity>> getAll(){
        return ResponseEntity.ok(this.serviceService.getAll());
    }
}
