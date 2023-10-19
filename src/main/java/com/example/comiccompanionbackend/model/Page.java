package com.example.comiccompanionbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "comic_id")
    private Comic comic;

    public Page() {
    }

    public Page(Long id, URL url, String pageNumber) {
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

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", url=" + url +
                ", pageNumber='" + pageNumber + '\'' +
                ", comic=" + comic +
                '}';
    }
}
