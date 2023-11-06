package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "owners")
@Getter
@Setter
@NoArgsConstructor
public class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_owner", nullable = false)
    private Integer idOwner;

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
