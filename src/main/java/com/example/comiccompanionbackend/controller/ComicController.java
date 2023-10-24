package com.example.comiccompanionbackend.controller;

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

/**
 * The ComicController class handles HTTP requests related to comics and comic pages.
 * It provides endpoints for retrieving information about comics and their associated pages.
 */
@RestController
@RequestMapping("/api/v1")
public class ComicController {
    Logger log = Logger.getLogger(ComicController.class.getName());

    static HashMap<String, Object> result = new HashMap<>();
    static HashMap<String, Object> message = new HashMap<>();

    private ComicService comicService;

    /**
     * Setter for the ComicService dependency.
     *
     * @param comicService The ComicService instance to be injected.
     */
    @Autowired
    public void setComicService(ComicService comicService) {
        this.comicService = comicService;
    }

    /**
     * Retrieves a list of all comics.
     *
     * @return A JSON response containing a list of all comics or an error message if none are found.
     */
    @GetMapping(path = "/comics")
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

    /**
     * Retrieves a specific comic by its ID.
     *
     * @param comicId The unique identifier of the comic to retrieve.
     * @return A JSON response containing the requested comic or an error message if it's not found.
     */
    @GetMapping(path = "/comics/{comicId}")
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

    /**
     * Retrieves a list of pages associated with a specific comic by its ID.
     *
     * @param comicId The unique identifier of the comic.
     * @return A JSON response containing a list of pages or an error message if none are found.
     */
    @GetMapping(path = "/comics/{comicId}/pages")
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

    /**
     * Retrieves a specific page within a comic by comic ID and page ID.
     *
     * @param comicId The unique identifier of the comic.
     * @param pageId The unique identifier of the page.
     * @return A JSON response containing the requested page or an error message if it's not found.
     */
    @GetMapping(path = "/comics/{comicId}/pages/{pageId}")
    public ResponseEntity<?> getComicPage(@PathVariable(value = "comicId") Long comicId, @PathVariable(value = "pageId") Long pageId) {
        Optional<Page> page = Optional.ofNullable(comicService.getComicPage(comicId, pageId));

        if (page.isEmpty()){
            message.put("message", "cannot find any page id of " + pageId);
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else {
            message.put("message", "success");
            message.put("data", page);
            return new ResponseEntity<>(message, HttpStatus.OK);
        }
    }
}
