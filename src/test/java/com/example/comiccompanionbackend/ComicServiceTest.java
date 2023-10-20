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
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(MockitoExtension.class)
public class ComicServiceTest {
    @InjectMocks
    private ComicService comicService;

    @Mock
    private ComicRepository comicRepository;

    @Mock
    private PageRepository pageRepository;

    @BeforeEach
    public void createComic(){
        Comic comic1 = new Comic(1L, "Comic 1", "Comic 1 Description");
        Comic comic2 = new Comic(2L, "Comic 2", "Comic 2 Description");
        Comic comic3 = new Comic(3L, "Comic 3", "Comic 3 Description");

        Page c1pg1 = new Page(1L, "mech-bros-images/Noxcomic_pg01_02.png", 1);
        Page c1pg2 = new Page(2L, "mech-bros-images/Noxcomic_pg02_02.png", 2);
        Page c1pg3 = new Page(3L, "mech-bros-images/Noxcomic_pg03_05.png", 3);
    }

    @Test
    public void shouldReturnHelloWorld_success() throws Exception {

    }
}
