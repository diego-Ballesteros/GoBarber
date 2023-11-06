package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "barbers")
@Getter
@Setter
@NoArgsConstructor

public class BarberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barber", nullable = false)
    private Integer idBarber;
    @Column(nullable = false)
    private Integer yearsExperience;

    // fk
    // user id (super entidad)
    // barberShop id
}
