package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.BarberEntity;
import com.gobarber.demo.persistence.entity.BarberShopEntity;
import com.gobarber.demo.persistence.repository.BarberShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarbershopService {
    private final BarberShopRepository barberShopRepository;

    @Autowired
    public BarbershopService(BarberShopRepository barberShopRepository) {
        this.barberShopRepository = barberShopRepository;
    }

    public List<BarberShopEntity> getAll(){
        return this.barberShopRepository.findAll();
    }
}
