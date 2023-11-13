package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "services_location")
@Getter
@Setter
@NoArgsConstructor
public class ServicesByLocationEntity {

    @Id
    @Column(name = "id_service_location", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServicesByLocation;

    //------------------ FK ----------------------------
    @Column(name = "service_id", nullable = false)
    private Integer idService;

    @Column(name = "location_id", nullable = false)
    private Integer IdLocation;

    //------------------ RELATIONS ----------------------------
    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id_service", insertable = false, updatable = false)
    @JsonIgnore
    private ServiceEntity service;

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id_location", insertable = false, updatable = false)
    @JsonIgnore
    private LocationEntity location;
}
