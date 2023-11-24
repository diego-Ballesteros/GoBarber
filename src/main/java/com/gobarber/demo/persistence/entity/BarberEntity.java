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
    @Column(name = "id_user_barber", nullable = false, unique = true)
    private Integer idUserBarber;

    private String name;

    @Column(nullable = false)
    private Integer yearsExperience;

    private String photo;

    // -------------------- FK ---------------------------


    @Column(name = "barbershop_id", nullable = false)
    private Integer idBarbershop;

    //------------------ RELATIONS ----------------------------
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user_barber", referencedColumnName = "id_user", insertable = false, updatable = false)
    @JsonIgnore
    private UserEntity userB;

    @ManyToOne
    @JoinColumn(name = "barbershop_id", referencedColumnName = "id_barbershop", insertable = false, updatable = false)
    @JsonIgnore
    private BarberShopEntity barberShop;

    @OneToMany(mappedBy = "barber", fetch = FetchType.EAGER)
    private List<ReviewBarberEntity> reviewBarber;
    @OneToMany(mappedBy = "barber", fetch = FetchType.EAGER)
    private List<AppointmentEntity> appointments;

}
