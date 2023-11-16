package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.BarberEntity;
import com.gobarber.demo.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gobarber/barbers")
public class BarberController {

    private final BarberService barberService;

    @Autowired
    public BarberController(BarberService barberService) {
        this.barberService = barberService;
    }
    @GetMapping()
    public ResponseEntity<List<BarberEntity>> getAll(){
        return ResponseEntity.ok(this.barberService.getAll());
    }
}
