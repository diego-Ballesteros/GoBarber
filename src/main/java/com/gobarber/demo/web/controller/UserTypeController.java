package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.UserTypeEntity;
import com.gobarber.demo.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gobarber/userTypes")
public class UserTypeController {
    private final UserTypeService userTypeService;
    @Autowired
    public UserTypeController(UserTypeService userTypeService) {
        this.userTypeService = userTypeService;
    }
    @GetMapping()
    public ResponseEntity<List<UserTypeEntity>> getAll (){
        return ResponseEntity.ok(this.userTypeService.getAll());
    }
}
