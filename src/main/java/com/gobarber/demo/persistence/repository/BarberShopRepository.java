package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.BarberShopEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberShopRepository extends ListCrudRepository<BarberShopEntity, Integer> {
}
