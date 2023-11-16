package com.gobarber.demo.service;

import com.gobarber.demo.persistence.entity.AppointmentEntity;
import com.gobarber.demo.persistence.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<AppointmentEntity> getAll(){
        return this.appointmentRepository.findAll();
    }
}
