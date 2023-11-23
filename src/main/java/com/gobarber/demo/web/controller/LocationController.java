package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.Dto.LocationDto;
import com.gobarber.demo.persistence.entity.LocationEntity;
import com.gobarber.demo.persistence.entity.mapper.LocationMapper;
import com.gobarber.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gobarber/locations")
public class LocationController {
    private final LocationService locationService;
    private final LocationMapper locationMapper;
    @Autowired
    public LocationController(LocationService locationService, LocationMapper locationMapper) {
        this.locationService = locationService;
        this.locationMapper = locationMapper;
    }
    /*@GetMapping
    public ResponseEntity<List<LocationDto>> getAll(){
        List<LocationDto> locationDtos = null;
        locationDtos = this.locationService.getAll().stream()
                .map(location -> this.locationMapper.locationEntityToLocationDto(location))
                .collect(Collectors.toList());
        return ResponseEntity.ok(locationDtos);
    }*/
    @GetMapping
    public ResponseEntity<List<LocationEntity>> getAll(){
        return ResponseEntity.ok(this.locationService.getAll());
    }
}
