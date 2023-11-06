package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Appointment_types")
@Getter
@Setter
@NoArgsConstructor
public class AppointmentTypeEntity {
    @Id
    @Column(name = "id_Appointment_type", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAppointmentType;

    @Column(nullable = false, length = 50)
    private String name;
}
