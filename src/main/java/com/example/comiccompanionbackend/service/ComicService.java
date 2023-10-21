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

    public Optional<Comic> getComic(Long comicId) {
        Optional<Comic> comicOptional = comicRepository.findById(comicId);
        if(comicOptional.isPresent()){
            return comicRepository.findById(comicId);
        } else {
            throw new InformationNotFoundException("Error: Comic with Id " + comicId + " does not exist.");
        }
    }

    public List<Page> getComicPages(Long comicId) {
        Optional<Comic> comicOptional = comicRepository.findById(comicId);
        if(comicOptional.isPresent()){
            return pageRepository.findAllByComicId(comicId);
        } else {
            throw new InformationNotFoundException("Error: Comic with Id " + comicId + " does not exist.");
        }

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
