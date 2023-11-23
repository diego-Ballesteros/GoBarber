package com.gobarber.demo.persistence.entity.mapper;

import com.gobarber.demo.persistence.entity.BarberShopEntity;
import com.gobarber.demo.persistence.entity.Dto.BarberShopDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BarbershopMapper {

    BarberShopDto barbershopEntityToBarbershopDto(BarberShopEntity barberShop);
    BarberShopEntity barbershopDtoToBarbershopEntity(BarberShopDto barberShopDto);

}
