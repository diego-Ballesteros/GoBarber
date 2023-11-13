package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(length = 250)
    private String description;
    @Column(name = "expiration_date",nullable = false, columnDefinition = "DATE")
    private LocalDate expirationDate;
    @Column(name = "use_date",columnDefinition = "DATE")
    private LocalDate UseDate;

    //------------------ FK ----------------------------
    @Column(name = "barbershop_id", nullable = false)
    private Integer idBerbershop;
    @Column(name = "customer_id", nullable = false)
    private Integer idCustomer;

    //------------------ RELATIONS ----------------------------
    @ManyToOne
    @JoinColumn(name = "barbershop_id", referencedColumnName = "id_barbershop  ", insertable = false, updatable = false)
    @JsonIgnore
    private BarberShopEntity barbershop;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id_customer", insertable = false, updatable = false)
    @JsonIgnore
    private CustomerEntity customer;

}
