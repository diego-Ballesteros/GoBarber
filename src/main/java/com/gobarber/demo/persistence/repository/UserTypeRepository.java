package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.UserTypeEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends ListCrudRepository<UserTypeEntity, Integer> {
}
