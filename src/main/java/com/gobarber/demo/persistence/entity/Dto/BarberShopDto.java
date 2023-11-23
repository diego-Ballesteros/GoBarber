package com.gobarber.demo.persistence.entity.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gobarber.demo.persistence.entity.LocationEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class BarberShopDto {

    @JsonProperty("idBarberShop")
    private Integer idBarberShop;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("biografia")
    private String biografia;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("profilePicture")
    private String profilePicture;

    //@JsonProperty("locations")
    //private LocationDto location;

}
