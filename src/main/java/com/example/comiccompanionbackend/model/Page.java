package com.example.comiccompanionbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.net.URL;

/**
 * The Page class represents a page of a comic, typically stored in a database.
 * It contains information about the page, such as its URL, page number, and the associated comic.
 * This class is typically used in a Java Persistence API (JPA) context for database interaction.
 *
 * Each page has a unique identifier (ID), a URL that points to the page's content, and a page number within the comic.
 * Additionally, each page is associated with a parent `Comic` object, which is represented as a many-to-one relationship.
 *
 * @Entity Indicates that this class is a JPA entity, meaning it can be persisted in a database.
 * @Table(name = "pages") Specifies the name of the database table associated with this entity.
 */
@Entity
@Table(name = "pages")
public class Page {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String url;

    @Column
    private int pageNumber;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "comic_id")
    private Comic comic;

    /**
     * Default constructor for the `Page` class.
     */
    public Page() {
    }

    /**
     * Parameterized constructor for the `Page` class.
     *
     * @param id The unique identifier for the page.
     * @param url The URL pointing to the page's content.
     * @param pageNumber The page number within the comic.
     */
    public Page(Long id, String url, int pageNumber) {
        this.id = id;
        this.url = url;
        this.pageNumber = pageNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Comic getComic() {
        return comic;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
    }

    /**
     * Returns a string representation of the `Page` object.
     *
     * @return A string containing the ID, URL, page number, and associated comic of the page.
     */
    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", pageNumber=" + pageNumber +
                ", comic=" + comic +
                '}';
    }
}
