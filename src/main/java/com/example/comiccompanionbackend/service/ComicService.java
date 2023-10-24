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

/**
 * The ComicService class provides service methods for managing comics and their associated pages.
 * It interacts with the ComicRepository and PageRepository to perform operations such as retrieving comics,
 * retrieving pages of a comic, and getting specific pages within a comic.
 *
 */
@Service
public class ComicService {
    private ComicRepository comicRepository;
    private PageRepository pageRepository;

    Logger log = Logger.getLogger(ComicService.class.getName());

    /**
     * Setter for the ComicRepository dependency.
     *
     * @param comicRepository The ComicRepository instance to be injected.
     */
    @Autowired
    public void setComicRepository( ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }

    /**
     * Constructor for the ComicService class, which injects the PageRepository dependency.
     *
     * @param pageRepository The PageRepository instance to be injected.
     */
    @Autowired
    public ComicService(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    public String getHelloWorld() {
        return "Hello World";
    }

    /**
     * Retrieves a list of all comics.
     *
     * @return A list of all comic entities in the database.
     */
    public List<Comic> getAllComics() {
        return comicRepository.findAll();
    }

    /**
     * Retrieves a specific comic by its unique identifier.
     *
     * @param comicId The unique identifier of the comic to retrieve.
     * @return The comic entity with the specified ID, or throws an InformationNotFoundException if not found.
     */
    public Comic getComic(Long comicId) {
            return comicRepository.findById(comicId)
                    .orElseThrow(() -> new InformationNotFoundException("Error: Comic with Id " + comicId + " does not exist."));
    }

    /**
     * Retrieves a list of pages associated with a specific comic by its ID.
     *
     * @param comicId The unique identifier of the comic.
     * @return A list of pages associated with the specified comic.
     */
    public List<Page> getComicPages(Long comicId) {
        return comicRepository.findById(comicId)
                .map(comic -> pageRepository.findAllByComicId(comicId))
                .orElseThrow(() -> new InformationNotFoundException("Error: Comic with Id " + comicId + " does not exist."));
    }

    /**
     * Retrieves a specific page within a comic by comic ID and page ID.
     *
     * @param comicId The unique identifier of the comic.
     * @param pageId  The unique identifier of the page.
     * @return The page with the specified comic ID and page ID, or throws an InformationNotFoundException if not found.
     */
    public Page getComicPage(Long comicId, Long pageId) {
        //grabs the comic object if it exists in comic repository
        Optional<Comic> comicOptional = comicRepository.findById(comicId);
        //grabs the page object if it exists in page repository
        Optional<Page> pageOptional = pageRepository.findById(pageId);

        if (comicOptional.isPresent()){
            // If page is present AND the comicId matches the id of the comic that is associated with the page
            if(pageOptional.isPresent() && pageOptional.get().getComic().getId().equals(comicOptional.get().getId())) {
                return pageRepository.findByComicIdAndId(comicId, pageId);
            } else {
                throw new InformationNotFoundException("Error: Page with Id " + pageId + " does not exist for this comic.");
            }
        } else {
            throw new InformationNotFoundException("Error: Comic with title " + comicId + " does not exist.");
        }
    }
}
