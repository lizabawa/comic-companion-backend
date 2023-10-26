package com.example.comiccompanionbackend;

import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
import com.example.comiccompanionbackend.repository.ComicRepository;
import com.example.comiccompanionbackend.repository.PageRepository;
import com.example.comiccompanionbackend.service.ComicService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@ExtendWith(MockitoExtension.class)
public class ComicServiceTest {
    @Mock
    private ComicService comicService;

    @Mock
    private ComicRepository comicRepository;

    @Mock
    private PageRepository pageRepository;

    @Test
    public void testGetAllComics() {
        Comic comic1 = new Comic(1L, "Comic 1", "Comic 1 Description", "src/main/images/red-ranger-images/red-ranger.png");
        Comic comic2 = new Comic(2L, "Comic 2", "Comic 2 Description", "src/main/images/red-ranger-images/red-ranger.png");
        Comic comic3 = new Comic(3L, "Comic 3", "Comic 3 Description", "src/main/images/red-ranger-images/red-ranger.png");
        List<Comic> expected = List.of(comic1, comic2, comic3);
        Mockito.when(comicRepository.findAll()).thenReturn(expected);
        List<Comic> result = comicRepository.findAll();
        assertEquals(expected, result);
        verifyNoMoreInteractions(comicRepository);
    }

    @Test
    public void testGetComic() {
        Long comicId = 1L;
        Comic comic1 = new Comic(1L, "Comic 1", "Comic 1 Description", "src/main/images/red-ranger-images/red-ranger.png");

        Mockito.when(comicRepository.findById(comicId)).thenReturn(Optional.of(comic1));
        Optional<Comic> result = comicRepository.findById(comicId);
        assertTrue(result.isPresent());
        assertEquals(comic1, result.get());
        verifyNoMoreInteractions(comicRepository);
    }

    @Test
    public void testGetComicPages() {
        Long comicId = 1L;
        Comic comic1 = new Comic(1L, "Comic 1", "Comic 1 Description", "src/main/images/red-ranger-images/red-ranger.png");
        Page c1pg1 = new Page(1L, "src/main/images/mech-bros-images/Noxcomic_pg01_02.png", 1);
        c1pg1.setComic(comic1);
        Page c1pg2 = new Page(2L, "src/main/images/mech-bros-images/Noxcomic_pg02_02.png", 2);
        c1pg2.setComic(comic1);
        Page c1pg3 = new Page(3L, "src/main/images/mech-bros-images/Noxcomic_pg03_05.png", 3);
        c1pg3.setComic(comic1);

        List<Page> expected = List.of(c1pg1, c1pg2, c1pg3);

        Mockito.when(pageRepository.findAllByComicId(comicId)).thenReturn(expected);
        List<Page> result = pageRepository.findAllByComicId(comicId);
        assertEquals(expected, result);
        verifyNoMoreInteractions(comicRepository);
        verifyNoMoreInteractions(pageRepository);
    }

    @Test
    public void testGetComicPage() {
        Long comicId = 1L;
        Comic comic1 = new Comic(1L, "Comic 1", "Comic 1 Description", "src/main/images/red-ranger-images/red-ranger.png");
        Page c1pg1 = new Page(1L, "src/main/images/mech-bros-images/Noxcomic_pg01_02.png", 1);
        c1pg1.setComic(comic1);

        Mockito.when(pageRepository.findByComicIdAndId(comicId, c1pg1.getId())).thenReturn(c1pg1);
        Page result = pageRepository.findByComicIdAndId(comicId, c1pg1.getId());
        assertEquals(c1pg1, result);
        verifyNoMoreInteractions(pageRepository);
    }
}
