package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
@Getter
@Setter
@NoArgsConstructor
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_review", nullable = false)
    private Integer idReview;
    @Column(columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime date;
    @Column(length = 2, nullable = false)
    private Integer rating;
    @Column(length = 200)
    private String comment;
    @Column(name = "is_for_barber", nullable = false, columnDefinition = "TINYINT")
    private Boolean isForBarber;
    @Column(name = "customer_id", nullable = false)
    private Integer idCustomer;

    // fk
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id_customer", insertable = false, updatable = false)
    @JsonIgnore
    private CustomerEntity customer;
    // cliente id mucho aqui, uno cliente


}
