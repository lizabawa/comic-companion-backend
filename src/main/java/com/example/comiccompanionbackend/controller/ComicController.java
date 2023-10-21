package com.example.comiccompanionbackend.controller;

import com.example.comiccompanionbackend.exception.InformationNotFoundException;
import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
import com.example.comiccompanionbackend.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/comics")
public class ComicController {
    Logger log = Logger.getLogger(ComicController.class.getName());

    private ComicService comicService;

    @Autowired
    public void setComicService(ComicService comicService) {
        this.comicService = comicService;
    }

    @GetMapping(path = "/helloworld")
    public String getHelloWorld() {
        return comicService.getHelloWorld();
    }

    ;

    @GetMapping(path = "")
    public List<Comic> getAllComics() {
        return comicService.getAllComics();
    }

    @GetMapping(path = "/{comicId}")
    public Optional<Comic> getComic(@PathVariable(value = "comicId") Long comicId) {
        return comicService.getComic(comicId);
    }

    @GetMapping(path = "/{comicId}/pages")
    public List<Page> getComicPages(@PathVariable(value = "comicId") Long comicId) {
        return comicService.getComicPages(comicId);
    }
}
