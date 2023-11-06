package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Barbershops")
@Getter
@Setter
@NoArgsConstructor
public class BarberShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barbershop", nullable = false)
    private Integer idBarberShop;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "phone_number", length = 30)
    private String phoneNumber;

    @Column(length = 100)
    private String email;

    @Column(name = "image_logo")
    private String logo;

}
