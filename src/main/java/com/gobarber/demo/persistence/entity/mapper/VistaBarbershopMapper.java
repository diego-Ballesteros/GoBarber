package com.gobarber.demo.persistence.entity.mapper;

import com.gobarber.demo.persistence.entity.BarberEntity;
import com.gobarber.demo.persistence.entity.BarberShopEntity;
import com.gobarber.demo.persistence.entity.Dto.VistaBarberShopDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface VistaBarbershopMapper {
    VistaBarberShopDto barbershopEntitytoVistaBarbershop (BarberShopEntity barbershopEntity);
    BarberShopEntity VistaBarbershopEntityToBarbershopEntity(VistaBarberShopDto barberShopDto);
}
