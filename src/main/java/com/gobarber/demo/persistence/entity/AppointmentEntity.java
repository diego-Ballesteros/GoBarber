package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

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

    //------------------ FK ----------------------------
    @Column(name = "barbershop_id", nullable = false)
    private Integer idBerbershop;
    @Column(name = "appointment_type_id", nullable = false)
    private Integer idAppointmentType;
    @Column(name = "customer_id", nullable = false)
    private Integer idCustomer;
    @Column(name = "barber_id", nullable = false)
    private Integer idBarber;

    //------------------ RELATIONS ----------------------------
    @ManyToOne
    @JoinColumn(name = "barbershop_id", referencedColumnName = "id_barbershop  ", insertable = false, updatable = false)
    @JsonIgnore
    private BarberShopEntity barbershop;

    @ManyToOne
    @JoinColumn(name = "appointment_type_id", referencedColumnName = "id_Appointment_type", insertable = false, updatable = false)
    @JsonIgnore
    private AppointmentTypeEntity appointmentType;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id_customer", insertable = false, updatable = false)
    @JsonIgnore
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "barber_id", referencedColumnName = "id_barber", insertable = false, updatable = false)
    @JsonIgnore
    private BarberEntity barber;

    @OneToMany(mappedBy = "appointment", fetch = FetchType.EAGER)
    private List<NotificationEntity> notifications;

    @OneToMany(mappedBy = "appointment", fetch = FetchType.EAGER)
    private List<ServiceByAppointmentEntity> servicesByAppointment;

}
