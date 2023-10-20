package com.example.comiccompanionbackend.controller;

import com.example.comiccompanionbackend.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    };
}
