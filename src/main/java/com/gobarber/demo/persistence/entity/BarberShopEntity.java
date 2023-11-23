package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Barbershops")
@Getter
@Setter
@NoArgsConstructor
public class BarberShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barbershop", nullable = false, unique = true)
    private Integer idBarberShop;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(name = "phone_number", length = 30)
    private String phoneNumber;
    @Column(length = 100, unique = true)
    private String email;

    @Column(nullable = false)
    private String biografia;

    @Column(name = "image_logo", nullable = false)
    private String logo;

    @Column(name = "profile_picture", nullable = false)
    private String profilePicture;

    @Column(name = "owner_id", nullable = false)
    private Integer idOwner;
    // --------------------  FK  -------------------------

    @OneToMany(mappedBy = "barberShop", fetch = FetchType.EAGER)
    private List<PromotionEntity> promotions;

    @OneToMany(mappedBy = "barberShop", fetch = FetchType.EAGER)
    private List<LocationEntity> locations;

    @OneToMany(mappedBy = "barberShop", fetch = FetchType.EAGER)
    private List<BarberEntity> barbers;

    @OneToMany(mappedBy = "barbershop", fetch = FetchType.EAGER)
    private List<AppointmentEntity> appointments;

    @OneToMany(mappedBy = "barbershop", fetch = FetchType.EAGER)
    private List<CouponEntity> coupons;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id_user_owner", insertable = false, updatable = false)
    @JsonIgnore
    private OwnerEntity owner;

    @OneToMany(mappedBy = "barberShop", fetch = FetchType.EAGER)
    private List<ReviewBarberShopEntity> reviewBarberShops;
}
