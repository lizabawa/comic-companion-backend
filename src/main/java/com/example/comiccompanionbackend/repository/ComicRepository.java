package com.example.comiccompanionbackend.repository;

import com.example.comiccompanionbackend.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The ComicRepository interface is a Spring Data JPA repository that provides data access operations for the Comic entity.
 * It extends the JpaRepository interface, which provides common CRUD (Create, Read, Update, Delete) operations for the Comic entity.
 *
 * This repository allows you to interact with the database and perform operations such as saving, updating, deleting, and querying Comic entities.
 * It is typically used in conjunction with Spring Data JPA and can be autowired into other components for database access.
 */
@Repository
public interface ComicRepository extends JpaRepository<Comic, Long> {
}
