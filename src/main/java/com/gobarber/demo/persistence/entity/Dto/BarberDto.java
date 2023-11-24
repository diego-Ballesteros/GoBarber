package com.gobarber.demo.persistence.entity.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class BarberDto {

    @JsonProperty("idUserBarber")
    private Integer idUserBarber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("photo")
    private String photo;

}
