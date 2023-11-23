package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.Dto.ServicesByLocationDto;
import com.gobarber.demo.persistence.entity.ServicesByLocationEntity;
import com.gobarber.demo.persistence.entity.mapper.ServicesByLocationMapper;
import com.gobarber.demo.service.ServiceByLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("gobarber/service_by_location")
public class ServiceByLocationController {

    private final ServiceByLocationService serviceBylocationService;
    private final ServicesByLocationMapper servicesByLocationMapper;
    @Autowired
    public ServiceByLocationController(ServiceByLocationService locationService, ServicesByLocationMapper servicesByLocationMapper) {
        this.serviceBylocationService = locationService;
        this.servicesByLocationMapper = servicesByLocationMapper;
    }
    @GetMapping()
    public ResponseEntity<List<ServicesByLocationDto>> getAll(){
        List<ServicesByLocationDto> servicesByLocationDtos = null;
        servicesByLocationDtos = this.serviceBylocationService.getAll().stream()
                .map(service -> this.servicesByLocationMapper.serviceByLocationEntityToServiceByLocationDto(service))
                .collect(Collectors.toList());
        return ResponseEntity.ok(servicesByLocationDtos);
    }

}
