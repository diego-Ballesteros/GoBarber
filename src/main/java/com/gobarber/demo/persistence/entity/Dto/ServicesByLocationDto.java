package com.gobarber.demo.persistence.entity.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gobarber.demo.persistence.entity.ServiceEntity;
import lombok.Data;

@Data
public class ServicesByLocationDto {

    @JsonProperty("idService")
    private Integer idService;
    @JsonProperty("IdLocation")
    private Integer IdLocation;
    @JsonProperty("service")
    private ServiceDto service;

}
