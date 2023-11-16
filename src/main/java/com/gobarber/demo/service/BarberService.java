package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.BarberEntity;
import com.gobarber.demo.persistence.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberService {
    private final BarberRepository barberRepository;
    @Autowired
    public BarberService(BarberRepository barberRepository) {
        this.barberRepository = barberRepository;
    }

    public List<BarberEntity> getAll(){
        return this.barberRepository.findAll();
    }
}
