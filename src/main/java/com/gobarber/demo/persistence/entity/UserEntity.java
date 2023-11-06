package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(name = "birth_date",columnDefinition = "DATE")
    private LocalDate birthDate;

    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;

    @Column(length = 100)
    private String address;
  // -------------------- FK ---------------------------
    @Column(name = "user_type_id", nullable = false)
    private Integer idUserType;
    //------------------ RELATIONS ----------------------------
    /*@ManyToOne
    @JoinColumn(name = "user_type_id", referencedColumnName = "id_user_type")
                    //insertable = false, updatable = false)
    @JsonIgnore
    private UserTypeEntity userTypeEntity;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<BarberEntity> barbers;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<OwnerEntity> owners;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<CustomerEntity> customers;*/
}
