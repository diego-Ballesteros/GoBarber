package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.Dto.ServiceDto;
import com.gobarber.demo.persistence.entity.mapper.ServiceMapper;
import com.gobarber.demo.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gobarber/services")
public class ServiceController {

    private final ServiceService serviceService;
    private final ServiceMapper serviceMapper;
    @Autowired
    public ServiceController(ServiceService serviceService, ServiceMapper serviceMapper) {
        this.serviceService = serviceService;
        this.serviceMapper = serviceMapper;
    }

    @GetMapping()
    public ResponseEntity<List<ServiceDto>> getAll(){
        List<ServiceDto> serviceDtos = null;
        serviceDtos = this.serviceService.getAll().stream()
                .map(service -> this.serviceMapper.serviceEntityToServiceDto(service))
                .collect(Collectors.toList());
        return ResponseEntity.ok(serviceDtos);
    }
}
