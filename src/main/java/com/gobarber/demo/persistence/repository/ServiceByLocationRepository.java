package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.ServicesByLocationEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceByLocationRepository extends ListCrudRepository<ServicesByLocationEntity, Integer> {
}
