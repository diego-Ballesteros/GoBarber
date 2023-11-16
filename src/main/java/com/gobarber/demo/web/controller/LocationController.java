package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.LocationEntity;
import com.gobarber.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gobarber/locations")
public class LocationController {
    private final LocationService locationService;
    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }
    @GetMapping
    public ResponseEntity<List<LocationEntity>> getAll(){
        return ResponseEntity.ok(this.locationService.getAll());
    }
}
