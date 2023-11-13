package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @Column(nullable = false, length = 70)
    private String name;

    @OneToMany(mappedBy = "appointmentType", fetch = FetchType.EAGER)
    private List<AppointmentEntity> appointments;

}
