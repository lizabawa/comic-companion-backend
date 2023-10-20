package com.example.comiccompanionbackend;

import com.example.comiccompanionbackend.controller.ComicController;
import com.example.comiccompanionbackend.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ComicService.class)
public class ComicServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ComicController comicController;
}
