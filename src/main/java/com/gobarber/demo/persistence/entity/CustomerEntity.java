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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer", nullable = false)
    private Integer idCustomer;

    @Column(name = "current_city", nullable = false, length = 50)
    private String city;
    // -------------------- FK ---------------------------
    @Column(name = "user_id")
    private Integer idUser;

    //------------------ RELATIONS ----------------------------
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id_user", insertable = false, updatable = false)
    @JsonIgnore
    private UserEntity userC;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<ReviewEntity> reviews;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<AppointmentEntity> appointments;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<CouponEntity> coupons;

}
