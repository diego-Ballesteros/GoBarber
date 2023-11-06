package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Appointments")
@Setter
@Getter
@NoArgsConstructor
public class AppointmentEntity {
    @Id
    @Column(name = "id_Appointment", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAppointment;
    @Column(columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime date;

    // fk
    // barber id
    // customer id
    // barbershop id
    // appointment type id
}
