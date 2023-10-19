package com.example.comiccompanionbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "comics")
public class Comic {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String description;
}
