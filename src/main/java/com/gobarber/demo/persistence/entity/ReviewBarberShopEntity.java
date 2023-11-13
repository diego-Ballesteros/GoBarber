package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    //------------------ FK ----------------------------
    @Column(name = "review_id", nullable = false)
    private Integer idReview;
    @Column(name = "barbershop_id", nullable = false)
    private Integer idBarberShop;

    //------------------ RELATIONS ----------------------------
    @ManyToOne
    @JoinColumn(name = "review_id", referencedColumnName = "id_review", insertable = false, updatable = false)
    @JsonIgnore
    private ReviewEntity review;
    @ManyToOne
    @JoinColumn(name = "barbershop_id", referencedColumnName = "id_barbershop", insertable = false, updatable = false)
    @JsonIgnore
    private BarberShopEntity barberShop;

}
