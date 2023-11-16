package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.ReviewEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends ListCrudRepository<ReviewEntity, Integer> {
}
