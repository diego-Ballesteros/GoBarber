package com.gobarber.demo.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    //------------------ FK ----------------------------
    @Column(name = "review_id", nullable = false)
    private Integer idReview;
    @Column(name = "barber_id", nullable = false)
    private Integer idBarber;

    //------------------ RELATIONS ----------------------------
    @ManyToOne
    @JoinColumn(name = "review_id", referencedColumnName = "id_review", insertable = false, updatable = false)
    @JsonIgnore
    private ReviewEntity review;

    @ManyToOne
    @JoinColumn(name = "barber_id", referencedColumnName = "id_user_barber", insertable = false, updatable = false)
    @JsonIgnore
    private BarberEntity barber;

}
