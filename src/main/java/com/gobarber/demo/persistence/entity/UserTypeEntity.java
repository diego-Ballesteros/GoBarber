package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "user_types")
@Getter
@Setter
@NoArgsConstructor
public class UserTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_type", nullable = false)
    private Integer idUserType;

    @Column(nullable = false, length = 50)
    private String name;

    //------------------ RELATIONS ----------------------------

    @OneToMany(mappedBy = "userTypeEntity", fetch = FetchType.EAGER)
    private List<UserEntity> users;
}
