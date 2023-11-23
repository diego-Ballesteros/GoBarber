package com.gobarber.demo.persistence.entity.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gobarber.demo.persistence.entity.ServiceByAppointmentEntity;
import com.gobarber.demo.persistence.entity.ServiceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class LocationDto {

    @JsonProperty("idLocation")
    private Integer idLocation;
    @JsonProperty("city")
    private String city;
    @JsonProperty("coordinates")
    private String coordinates;
    @JsonProperty("address")
    private String address;
    @JsonProperty("rating")
    private Double rating;
    @JsonProperty("services")
    private ServicesByLocationDto servicesByLocationDto;
}
