package com.gobarber.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@NoArgsConstructor
public class NotificationEntity {
    @Id
    @Column(name = "id_notification")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotification;
    @Column(nullable = false, length = 100)
    private String title;
    @Column(name = "sending_date", columnDefinition = "DATETIME")
    private LocalDateTime sendingDate;

    // fk
    // customer id
    // appointment id

}
