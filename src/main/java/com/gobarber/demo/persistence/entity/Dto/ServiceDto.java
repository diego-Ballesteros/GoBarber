package com.gobarber.demo.persistence.entity.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ServiceDto {

    @JsonProperty("idService")
    private Integer idService;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("estimatedDuration")
    private Double estimatedDuration;
}
