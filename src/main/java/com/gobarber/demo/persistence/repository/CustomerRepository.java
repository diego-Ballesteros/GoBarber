package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.CustomerEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ListCrudRepository<CustomerEntity, Integer> {

}
