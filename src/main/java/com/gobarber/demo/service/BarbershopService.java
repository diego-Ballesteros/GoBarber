package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.BarberEntity;
import com.gobarber.demo.persistence.entity.BarberShopEntity;
import com.gobarber.demo.persistence.entity.LocationEntity;
import com.gobarber.demo.persistence.entity.ServiceEntity;
import com.gobarber.demo.persistence.repository.BarberShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public String getName (int id){
        return this.barberShopRepository.getNameBarbershop(id);
    }

    public List<LocationEntity> getStreetBarberShop (int idBarbershop){
        return this.barberShopRepository.getStreetBarber(idBarbershop);
    }

    public List<ServiceEntity> getBarbershopServices (int idBarbershop){
        return this.barberShopRepository.getBarbershopServices(idBarbershop);
    }

    public List<BarberEntity> getBarbersByBarbershop(int idBarbershop){
        return this.barberShopRepository.getBarbersByBarbershop(idBarbershop);
    }

    public BarberShopEntity getById (int idBarbershop){
        return this.barberShopRepository.findById(idBarbershop)
                .orElseThrow(()-> new RuntimeException("no se encontro partido con esta fecha"));
    }
}
