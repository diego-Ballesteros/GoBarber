package com.gobarber.demo.persistence.repository;

import com.gobarber.demo.persistence.entity.BarberShopEntity;
import com.gobarber.demo.persistence.entity.LocationEntity;
import com.gobarber.demo.persistence.entity.ServiceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BarberShopRepository extends ListCrudRepository<BarberShopEntity, Integer> {
    @Query(value = "SELECT b.name " +
                    "FROM BarberShopEntity b " +
                    "WHERE b.idBarberShop = :idBarbershop ")
    String getNameBarbershop(@Param("idBarbershop") int idBarbershop);

    @Query(value = "SELECT l " +
                    "FROM BarberShopEntity b " +
                    "INNER JOIN LocationEntity l ON b.idBarberShop = l.idBarberShop " +
                    "WHERE b.idBarberShop = :idBarbershop ")
    List<LocationEntity> getStreetBarber(@Param("idBarbershop") int idBarbershop);

    @Query(value = "SELECT s " +
            "FROM BarberShopEntity b " +
            "INNER JOIN LocationEntity l ON b.idBarberShop = l.idBarberShop " +
            "INNER JOIN ServicesByLocationEntity sl ON l.idLocation = sl.IdLocation " +
            "INNER JOIN ServiceEntity s ON sl.idService = s.idService " +
            "WHERE b.idBarberShop = :idBarbershop ")
    List<ServiceEntity> getBarbershopServices (@Param("idBarbershop") int idBarbershop);

    @Override
    Optional<BarberShopEntity> findById(Integer integer);
}
