package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reviews_to_barberShop")
@Getter
@Setter
@NoArgsConstructor
public class ReviewBarberShopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_review_barberShop", nullable = false)
    private Integer idReviewBarberShop;
    // fk
    // review (super entidad)
    // barber shop id
}
