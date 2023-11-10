package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.BarberShopEntity;
import com.gobarber.demo.service.BarbershopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gobarber/barbershops")
public class BarbershopController {

    private final BarbershopService barbershopService;

    @Autowired
    public BarbershopController(BarbershopService barbershopService) {
        this.barbershopService = barbershopService;
    }
    @GetMapping
    public ResponseEntity<List<BarberShopEntity>> getAll(){
        return  ResponseEntity.ok(this.barbershopService.getAll());
    }
}
