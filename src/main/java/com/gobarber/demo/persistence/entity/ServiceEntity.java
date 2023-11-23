package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "services")
@Getter
@Setter
@NoArgsConstructor
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service", nullable = false)
    private Integer idService;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(length = 300)
    private String description;
    @Column(nullable = false, columnDefinition = "Decimal(7,2)")
    private Double price;
    @Column(columnDefinition = "Decimal(4,2)")
    private Double estimatedDuration; //horas y minutos ejem: 1.10 (una hora y diez minutos)

    //------------------ RELATIONS ----------------------------
    @OneToMany(mappedBy = "service", fetch = FetchType.EAGER)
    private List<ServicesByLocationEntity> servicesByLocationEntities;

    @OneToMany(mappedBy = "service", fetch = FetchType.EAGER)
    private List<ServiceByAppointmentEntity> servicesByAppointment;

}
