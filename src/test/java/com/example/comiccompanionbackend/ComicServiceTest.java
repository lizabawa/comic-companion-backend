package com.example.comiccompanionbackend;

import com.example.comiccompanionbackend.controller.ComicController;
import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
import com.example.comiccompanionbackend.repository.ComicRepository;
import com.example.comiccompanionbackend.repository.PageRepository;
import com.example.comiccompanionbackend.service.ComicService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ComicServiceTest {
    @Mock
    private ComicService comicService;

    @Mock
    private ComicController comicController;

    @Mock
    private ComicRepository comicRepository;

    @Mock
    private PageRepository pageRepository;

    @BeforeEach
    public void createComic(){
        Comic comic1 = new Comic(1L, "Comic 1", "Comic 1 Description");
        Comic comic2 = new Comic(2L, "Comic 2", "Comic 2 Description");
        Comic comic3 = new Comic(3L, "Comic 3", "Comic 3 Description");
        comicRepository.save(comic1);
        comicRepository.save(comic2);
        comicRepository.save(comic3);

        Page c1pg1 = new Page(1L, "mech-bros-images/Noxcomic_pg01_02.png", 1);
        Page c1pg2 = new Page(2L, "mech-bros-images/Noxcomic_pg02_02.png", 2);
        Page c1pg3 = new Page(3L, "mech-bros-images/Noxcomic_pg03_05.png", 3);
        pageRepository.save(c1pg1);
        pageRepository.save(c1pg2);
        pageRepository.save(c1pg3);
    }

    @Test
    public void testGetHelloWorld() {
        Mockito.when(comicService.getHelloWorld()).thenReturn("Hello World");
        String result = comicService.getHelloWorld();
        assertEquals("Hello World", result);
    }

    @Test
    public void testGetAllComics() {
        Comic comic1 = new Comic(1L, "Comic 1", "Comic 1 Description");
        Comic comic2 = new Comic(2L, "Comic 2", "Comic 2 Description");
        Comic comic3 = new Comic(3L, "Comic 3", "Comic 3 Description");
        List<Comic> expected = List.of(comic1, comic2, comic3);
        Mockito.when(comicService.getAllComics()).thenReturn(expected);
        List<Comic> result = comicService.getAllComics();
        assertEquals(expected, result);
    }

    @Test
    public void testGetComic(Comic comicId) {
        Comic comic1 = new Comic(1L, "Comic 1", "Comic 1 Description");
        Mockito.when(comicService.getComic(1L)).thenReturn(comic1);
        String result = comicService.getComic();
        assertEquals(comic1, result);
    }
}
