package com.gobarber.demo.persistence.entity.mapper;

import com.gobarber.demo.persistence.entity.BarberEntity;
import com.gobarber.demo.persistence.entity.Dto.BarberDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BarberDtoMapper {
    BarberDto barberEntityToBarberDto(BarberEntity barberEntity);
    BarberEntity barberDtoToBarberEntity(BarberDto barberDto);
}
