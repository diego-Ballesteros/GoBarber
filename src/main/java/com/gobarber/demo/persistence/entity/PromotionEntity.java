package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "promotions")
@Getter
@Setter
@NoArgsConstructor
public class PromotionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promotion", nullable = false)
    private Integer idPromotion;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 250)
    private String description;
    @Column(name = "discount_percentage")
    private Integer discountPercentage;
    @Column(name = "start_date", columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime startDate;
    @Column(name = "end_date", columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime endDate;

    //fk
    // barber shop id
}
