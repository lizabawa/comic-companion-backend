package com.example.comiccompanionbackend.service;

import com.example.comiccompanionbackend.repository.ComicRepository;
import com.example.comiccompanionbackend.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
