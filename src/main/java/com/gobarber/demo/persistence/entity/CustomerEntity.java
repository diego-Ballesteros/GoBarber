package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
    // -------------------- FK ---------------------------
    @Id
    @Column(name = "id_user_customer", nullable = false)
    private Integer idUserCustomer;
    // ----------------------------------------------------

    @Column(name = "current_city", nullable = false, length = 50)
    private String city;

    //------------------ RELATIONS ----------------------------
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user_customer", referencedColumnName = "id_user", insertable = false, updatable = false)
    @JsonIgnore
    private UserEntity userC;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<ReviewEntity> reviews;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<AppointmentEntity> appointments;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<CouponEntity> coupons;

}
