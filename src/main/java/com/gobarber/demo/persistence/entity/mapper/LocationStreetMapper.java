package com.gobarber.demo.persistence.entity.mapper;

import com.gobarber.demo.persistence.entity.Dto.LocationDto;
import com.gobarber.demo.persistence.entity.Dto.LocationStreetDto;
import com.gobarber.demo.persistence.entity.LocationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationStreetMapper {
    LocationStreetDto locationEntityToLocationStreetDto(LocationEntity location);
    LocationEntity locationDtoToLocationEntity(LocationStreetDto location);
}
