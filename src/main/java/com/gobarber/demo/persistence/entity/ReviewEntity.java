package com.gobarber.demo.persistence.entity;

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

    // fk
    // cliente id mucho aqui, uno cliente


}
