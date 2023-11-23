package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "locations")
@Getter
@Setter
@NoArgsConstructor
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_location", nullable = false)
    private Integer idLocation;
    @Column(length = 50, nullable = false)
    private String city;
    @Column(length = 150)
    private String coordinates;
    @Column(length = 100, nullable = false)
    private String address;
    @Column(nullable = false, length = 5)
    private Double rating;

    //------------------ FK ----------------------------
    @Column(name = "barbershop_id", nullable = false)
    private Integer idBarberShop;

    //------------------ RELATIONS ----------------------------
    @ManyToOne
    @JoinColumn(name = "barbershop_id", referencedColumnName = "id_barbershop", insertable = false, updatable = false)
    @JsonIgnore
    private BarberShopEntity barberShop;

    @OneToMany(mappedBy = "location", fetch = FetchType.EAGER)
    private List<ServicesByLocationEntity> servicesByLocationEntities;

}
