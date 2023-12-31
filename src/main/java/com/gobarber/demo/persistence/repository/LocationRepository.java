package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.LocationEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends ListCrudRepository<LocationEntity, Integer> {
}
