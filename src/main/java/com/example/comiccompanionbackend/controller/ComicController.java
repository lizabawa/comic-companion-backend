package com.example.comiccompanionbackend.controller;

import com.example.comiccompanionbackend.exception.InformationNotFoundException;
import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
import com.example.comiccompanionbackend.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/comics")
public class ComicController {
    Logger log = Logger.getLogger(ComicController.class.getName());

    static HashMap<String, Object> result = new HashMap<>();
    static HashMap<String, Object> message = new HashMap<>();

    private ComicService comicService;

    @Autowired
    public void setComicService(ComicService comicService) {
        this.comicService = comicService;
    }

    @GetMapping(path = "/helloworld")
    public String getHelloWorld() {
        return comicService.getHelloWorld();
    }

    @GetMapping(path = "")
    public ResponseEntity<?> getAllComics() {
        List<Comic> comics = comicService.getAllComics();
        if (comics.isEmpty()) {
            message.put("message", "cannot find any comics");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else {
            message.put("message", "success");
            message.put("data", comics);
            return new ResponseEntity<>(message, HttpStatus.OK);
        }
    }

    @GetMapping(path = "/{comicId}")
    public ResponseEntity<?> getComic(@PathVariable(value = "comicId") Long comicId) {
        Optional<Comic> comic = Optional.ofNullable(comicService.getComic(comicId));
        if (comic.isPresent()) {
            message.put("message", "success");
            message.put("data", comic.get());
            return new ResponseEntity<>(message, HttpStatus.OK);
        } else {
            message.put("message", "cannot find comic with id " + comicId);
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{comicId}/pages")
    public ResponseEntity<?> getComicPages(@PathVariable(value = "comicId") Long comicId) {
        List<Page> pagesList = comicService.getComicPages(comicId);
        if (pagesList.isEmpty()){
            message.put("message", "cannot find any pages for comic id: " + comicId);
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else {
            message.put("message", "success");
            message.put("data", pagesList);
            return new ResponseEntity<>(message, HttpStatus.OK);
        }
    }

    @GetMapping(path = "/{comicId}/pages/{pageId}")
    public Page getComicPage(@PathVariable(value = "comicId") Long comicId, @PathVariable(value = "pageId") Long pageId) {
        return comicService.getComicPage(comicId, pageId);
    }
}
