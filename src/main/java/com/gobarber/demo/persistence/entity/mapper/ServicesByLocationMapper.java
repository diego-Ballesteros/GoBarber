package com.gobarber.demo.persistence.entity.mapper;

import com.gobarber.demo.persistence.entity.Dto.ServicesByLocationDto;
import com.gobarber.demo.persistence.entity.ServicesByLocationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServicesByLocationMapper {
    ServicesByLocationEntity serviceByLocationDtoToServiceByLocationEntity(ServicesByLocationDto servicesByLocationDto);
    ServicesByLocationDto serviceByLocationEntityToServiceByLocationDto(ServicesByLocationEntity servicesByLocationEntity);
}
