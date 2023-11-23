package com.gobarber.demo.persistence.entity.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gobarber.demo.persistence.entity.LocationEntity;
import lombok.Data;

import java.util.List;

@Data
public class VistaBarberShopDto {

    @JsonProperty("barberShopDto")
    private BarberShopDto barberShopDto;
    @JsonProperty("locationDto")
    private List<LocationStreetDto> locationDto;
    @JsonProperty("serviceDto")
    private List<ServiceDto> serviceDto;
}
