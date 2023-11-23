package com.gobarber.demo.persistence.entity.mapper;

import com.gobarber.demo.persistence.entity.Dto.LocationDto;
import com.gobarber.demo.persistence.entity.LocationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    LocationDto locationEntityToLocationDto(LocationEntity location);
    LocationEntity locationDtoToLocationEntity(LocationDto location);
}
