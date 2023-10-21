package com.example.comiccompanionbackend.service;

import com.example.comiccompanionbackend.exception.InformationNotFoundException;
import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
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

    public Comic getComic(Long comicId) {
            return comicRepository.findById(comicId)
                    .orElseThrow(() -> new InformationNotFoundException("Error: Comic with Id " + comicId + " does not exist."));
    }

    public List<Page> getComicPages(Long comicId) {
        return comicRepository.findById(comicId)
                .map(comic -> pageRepository.findAllByComicId(comicId))
                .orElseThrow(() -> new InformationNotFoundException("Error: Comic with Id " + comicId + " does not exist."));
    }

    public Page getComicPage(Long comicId, Long pageId) {
        Optional<Comic> comicOptional = comicRepository.findById(comicId);
        Optional<Page> pageOptional = pageRepository.findById(pageId);

        if(comicOptional.isPresent()) {
            if(pageOptional.isPresent()) {
                return pageRepository.findByComicIdAndId(comicId, pageId);
            } else {
                throw new InformationNotFoundException("Error: Page with Id " + pageId + " does not exist.");
            }
        } else {
            throw new InformationNotFoundException("Error: Comic with Id " + comicId + " does not exist.");
        }
    }
}

// TODO should only pull pages related to the comic
// TODO if page for a comic does not exist, an error should be thrown
// TODO when viewing all comics, also show pages
