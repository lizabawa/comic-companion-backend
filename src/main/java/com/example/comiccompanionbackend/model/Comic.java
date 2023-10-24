package com.example.comiccompanionbackend.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * The `Comic` class represents a comic book or comic strip.
 * It contains information about the comic, such as its title, description, URL, and associated pages.
 *
 * Each comic has a unique identifier (ID), a title, a description, and a URL that points to its online location.
 * Additionally, a comic may have multiple associated pages, which are represented as a list of `Page` objects.
 *
 * @Entity Indicates that this class is a JPA entity, meaning it can be persisted in a database.
 * @Table(name = "comics") Specifies the name of the database table associated with this entity.
 */
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

    @Column
    private String url;

    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Page> page;

    /**
     * Default constructor for the `Comic` class.
     */
    public Comic() {
    }

    /**
     * Parameterized constructor for the `Comic` class.
     *
     * @param id The unique identifier for the comic.
     * @param title The title of the comic.
     * @param description A brief description of the comic.
     * @param url The URL pointing to the comic's location.
     */
    public Comic(Long id, String title, String description, String url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Page> getPage() {
        return page;
    }

    public void setPage(List<Page> page) {
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Returns a string representation of the `Comic` object.
     *
     * @return A string containing the ID, title, description, URL, and associated pages of the comic.
     */
    @Override
    public String toString() {
        return "Comic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", page=" + page +
                '}';
    }
}
