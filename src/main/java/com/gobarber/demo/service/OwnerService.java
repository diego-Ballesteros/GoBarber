package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.OwnerEntity;
import com.gobarber.demo.persistence.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    private final OwnerRepository ownerRepository;
    @Autowired
    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }
    public List<OwnerEntity> getAll(){
        return this.ownerRepository.findAll();
    }
}
