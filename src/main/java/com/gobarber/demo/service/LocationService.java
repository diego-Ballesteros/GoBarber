package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.LocationEntity;
import com.gobarber.demo.persistence.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private final LocationRepository locationRepository;
    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<LocationEntity> getAll(){
        return this.locationRepository.findAll();
    }
}
