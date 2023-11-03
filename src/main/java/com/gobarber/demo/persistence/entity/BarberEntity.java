package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "barbers")
@Setter
@Getter
@NoArgsConstructor
public class BarberEntity {
    @Id
    @Column(name = "id_barber", nullable = false, length = 50)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBarber;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "phone_number", nullable = false, length = 30)
    private String phoneNumber;

    @Column(length = 100)
    private String email;

    @Column(name = "image_logo")
    private String logo;
    
}
