package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    // -------------------- FK ---------------------------
    @Column(name = "user_id")
    private Integer idUser;

    //------------------ RELATIONS ----------------------------
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id_user", insertable = false, updatable = false)
    @JsonIgnore
    private UserEntity userB;


    //insertable = false, updatable = false)


    /*@JoinColumn
    private UserEntity user;*/
    // barberShop id
}
