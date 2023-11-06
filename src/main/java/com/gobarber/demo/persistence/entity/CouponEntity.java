package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name = "coupons")
@Getter
@Setter
@NoArgsConstructor
public class CouponEntity {
    @Id
    @Column(name = "id_coupon", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCoupon;
    @Column(nullable = false, length = 70)
    private String title;
    @Column(length = 200)
    private String description;
    @Column(name = "expiration_date",nullable = false, columnDefinition = "DATE")
    private LocalDate expirationDate;
    @Column(name = "use_date",columnDefinition = "DATE")
    private LocalDate UseDate;

    // forenkey
    // customer id
    // barbershop id


}
