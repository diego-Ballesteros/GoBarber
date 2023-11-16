package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.AppointmentEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends ListCrudRepository<AppointmentEntity, Integer> {
}
