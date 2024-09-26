package com.rocketseat.planner.activities;

import com.rocketseat.planner.trip.Trip;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table(name = "activities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(name = "ocurrs_at", nullable = false)
    private LocalDateTime ocurrsAt;

    @ManyToOne
    @JoinColumn(name = "trip_id", nullable = false) // Mude o nome da coluna conforme necessário
    private Trip trip;

    public Activity(String title, String ocurrsAt, Trip trip) {
        this.title = title;
        this.ocurrsAt = LocalDateTime.parse(ocurrsAt, DateTimeFormatter.ISO_DATE_TIME);
        this.trip = trip;
    }
}
