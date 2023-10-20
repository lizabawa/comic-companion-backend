package com.example.comiccompanionbackend.service;

import com.example.comiccompanionbackend.exception.InformationNotFoundException;
import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.repository.ComicRepository;
import com.example.comiccompanionbackend.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class ComicService {
    private ComicRepository comicRepository;
    private PageRepository pageRepository;

    Logger log = Logger.getLogger(ComicService.class.getName());

    @Autowired
    public void setComicRepository( ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }

    @Autowired
    public ComicService(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    public String getHelloWorld() {
        return "Hello World";
    }

    public List<Comic> getAllComics() {
        return comicRepository.findAll();
    }

    public Optional<Comic> getComic(Long comicId) {
        Optional<Comic> comicOptional = comicRepository.findById(comicId);
        if(comicOptional.isPresent()){
            return comicRepository.findById(comicId);
        } else {
            throw new InformationNotFoundException("Error: Comic with Id " + comicId + " does not exist.");
        }
    }
}
