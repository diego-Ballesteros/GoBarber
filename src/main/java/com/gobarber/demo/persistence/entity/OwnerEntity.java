package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "owners")
@Getter
@Setter
@NoArgsConstructor
public class OwnerEntity {
    // -------------------- FK ---------------------------
    @Id
    @Column(name = "id_user_owner", nullable = false)
    private Integer idUserOwner;

    //------------------ RELATIONS ----------------------------
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user_owner", referencedColumnName = "id_user", insertable = false, updatable = false)
    @JsonIgnore
    private UserEntity userO;

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<BarberShopEntity> barberShops;
}
