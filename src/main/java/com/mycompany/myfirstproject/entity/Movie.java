package com.mycompany.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Basic details
    private String title;
    private String description;
    private String language;
    private String country;

    // Dates & Duration
    private LocalDate releaseDate;
    private int durationMinutes;   // movie length in minutes

    // Ratings & Popularity
    private double rating;         // e.g., IMDb rating
    private int voteCount;         // number of votes/reviews
    private double boxOffice;      // worldwide gross collection

    // Crew & Cast
    private String director;
    private String writer;
    private String productionCompany;

    // Classification
    private String genre;          // e.g., Action, Comedy
    private String certificate;    // e.g., PG-13, R

    // Extra info
    private String posterUrl;
    private String trailerUrl;
    private boolean isAvailableOnStreaming; // e.g., Netflix/Prime

    // Relationships (optional, can be used if you normalize DB)
    @ElementCollection
    private List<String> cast;     // actors

    // Constructors, getters, setters...
}
