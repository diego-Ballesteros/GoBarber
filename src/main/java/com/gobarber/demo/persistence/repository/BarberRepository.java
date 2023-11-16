package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.BarberEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberRepository extends ListCrudRepository<BarberEntity, Integer> {
}
