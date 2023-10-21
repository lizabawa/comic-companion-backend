package com.example.comiccompanionbackend;

import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
import com.example.comiccompanionbackend.service.ComicService;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
public class ComicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ComicService comicService;

    Comic comic1;
    Page c1pg1;
    Page c1pg2;
    Page c1pg3;

    @BeforeEach
    void setUp(){
        comic1 = new Comic(1L, "Comic 1", "Comic 1 Description");
        c1pg1 = new Page(1L, "mech-bros-images/Noxcomic_pg01_02.png", 1);
        c1pg2 = new Page(2L, "mech-bros-images/Noxcomic_pg02_02.png", 2);
        c1pg3 = new Page(3L, "mech-bros-images/Noxcomic_pg03_05.png", 3);
    }
}
