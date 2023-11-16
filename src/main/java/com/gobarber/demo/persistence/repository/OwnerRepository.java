package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.OwnerEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends ListCrudRepository<OwnerEntity, Integer> {
}
