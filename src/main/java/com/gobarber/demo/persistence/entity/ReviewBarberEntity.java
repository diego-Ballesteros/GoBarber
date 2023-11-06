package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reviews_to_barber")
@Getter
@Setter
@NoArgsConstructor
public class ReviewBarberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_review_barber", nullable = false)
    private Integer idReviewBarber;
    // fk
    // review (super entidad)
    // barber id
}
