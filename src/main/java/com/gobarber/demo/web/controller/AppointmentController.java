package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.AppointmentEntity;
import com.gobarber.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {
    private final AppointmentService appointmentService;
    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    public ResponseEntity<List<AppointmentEntity>> getAll(){
        return ResponseEntity.ok(this.appointmentService.getAll());
    }
}
