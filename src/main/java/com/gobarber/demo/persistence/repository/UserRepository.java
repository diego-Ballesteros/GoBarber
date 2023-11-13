package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.UserEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ListCrudRepository<UserEntity, Integer> {
}
