package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    // -------------------- FK ---------------------------
    @Column(name = "user_id")
    private Integer idUser;

    //------------------ RELATIONS ----------------------------
    /*@ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id_user")
            //insertable = false, updatable = false)
    @JoinColumn
    private UserEntity user;*/
}
