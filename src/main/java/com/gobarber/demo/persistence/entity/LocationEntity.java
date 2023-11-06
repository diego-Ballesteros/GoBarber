package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    //fk
    // barber shop id

}
