package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.UserTypeEntity;
import com.gobarber.demo.persistence.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeService {
    private final UserTypeRepository userTypeRepository;
    @Autowired
    public UserTypeService(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    public List<UserTypeEntity> getAll (){
        return this.userTypeRepository.findAll();
    }
}
