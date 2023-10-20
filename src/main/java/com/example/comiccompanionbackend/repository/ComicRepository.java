package com.example.comiccompanionbackend.repository;

import com.example.comiccompanionbackend.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepository extends JpaRepository<Comic, Long> {
}
