package com.gobarber.demo.persistence.entity.mapper;

import com.gobarber.demo.persistence.entity.Dto.ServiceDto;
import com.gobarber.demo.persistence.entity.ServiceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    ServiceDto serviceEntityToServiceDto(ServiceEntity service);
    ServiceEntity serviceDtoToServiceEntity(ServiceDto service);
}
