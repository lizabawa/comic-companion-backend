package com.example.comiccompanionbackend.repository;

import com.example.comiccompanionbackend.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PageRepository extends JpaRepository<Page, Long> {
    List<Page> findAllByComicId(Long comicId);
    Page findByComicIdAndId(Long comicId, Long pageId);
}
