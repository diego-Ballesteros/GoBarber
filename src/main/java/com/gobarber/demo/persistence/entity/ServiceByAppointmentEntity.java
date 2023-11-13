package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "service_appointment")
@Setter
@Getter
@NoArgsConstructor
public class ServiceByAppointmentEntity {
    @Id
    @Column(name = "id_appointment_service", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAppointmentService;
    //--------------------- FK ----------------------------

    @Column(name = "service_id", nullable = false)
    private Integer idService;
    @Column(name = "appointment_id", nullable = false)
    private Integer idAppointment;

    //------------------ RELATIONS ----------------------------
    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id_service", insertable = false, updatable = false)
    @JsonIgnore
    private ServiceEntity service;

    @ManyToOne
    @JoinColumn(name = "appointment_id", referencedColumnName = "id_Appointment", insertable = false, updatable = false)
    @JsonIgnore
    private AppointmentEntity appointment;
}
