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
    private String url;

    @Column
    private int pageNumber;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "comic_id")
    private Comic comic;

    public Page() {
    }

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
