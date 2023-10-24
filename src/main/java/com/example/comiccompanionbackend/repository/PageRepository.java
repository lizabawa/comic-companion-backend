package com.example.comiccompanionbackend.repository;

import com.example.comiccompanionbackend.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The PageRepository interface is a Spring Data JPA repository that provides data access operations for the Page entity.
 * It extends the JpaRepository interface, which provides common CRUD (Create, Read, Update, Delete) operations for the Page entity.
 *
 * This repository allows you to interact with the database and perform operations such as saving, updating, deleting, and querying Page entities.
 * Additionally, it includes custom query methods for specific querying requirements related to pages within comics.
 *
 */
@Repository
public interface PageRepository extends JpaRepository<Page, Long> {
    /**
     * Retrieves a list of all pages associated with a specific comic by its ID.
     *
     * @param comicId The unique identifier of the comic.
     * @return A list of pages associated with the specified comic.
     */
    List<Page> findAllByComicId(Long comicId);

    /**
     * Retrieves a specific page within a comic by its comic ID and page ID.
     *
     * @param comicId The unique identifier of the comic.
     * @param pageId  The unique identifier of the page.
     * @return The page with the specified comic ID and page ID, or null if not found.
     */
    Page findByComicIdAndId(Long comicId, Long pageId);
//    Page findByComicIdAndPageNumber(Long comicId, int pageNumber);
}
