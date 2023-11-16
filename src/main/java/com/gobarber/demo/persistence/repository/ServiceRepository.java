package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.ServiceEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends ListCrudRepository<ServiceEntity, Integer> {
}
