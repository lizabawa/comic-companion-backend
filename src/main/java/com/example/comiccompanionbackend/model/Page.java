package com.example.comiccompanionbackend.model;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name = "pages")
public class Page {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private URL url;

    @Column
    private String pageNumber;
}
