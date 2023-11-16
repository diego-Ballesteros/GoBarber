package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.OwnerEntity;
import com.gobarber.demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class OwnerController {

    private final OwnerService ownerService;
    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    @GetMapping()
    public ResponseEntity<List<OwnerEntity>> getAll(){
        return ResponseEntity.ok(this.ownerService.getAll());
    }
}
