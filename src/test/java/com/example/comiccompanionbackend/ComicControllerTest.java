package com.example.comiccompanionbackend;

import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
import com.example.comiccompanionbackend.service.ComicService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class ComicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ComicService comicService;

    Comic comic1;
    Comic comic2;
    Comic comic3;
    Page c1pg1;
    Page c1pg2;
    Page c1pg3;

    @BeforeEach
    void setUp(){
        comic1 = new Comic(1L, "Comic 1", "Comic 1 Description", "src/main/images/red-ranger-images/red-ranger.png");
        comic2 = new Comic(2L, "Comic 2", "Comic 2 Description", "src/main/images/red-ranger-images/red-ranger.png");
        comic3 = new Comic(3L, "Comic 3", "Comic 3 Description", "src/main/images/red-ranger-images/red-ranger.png");
        c1pg1 = new Page(1L, "src/main/images/mech-bros-images/Noxcomic_pg01_02.png", 1);
        c1pg1.setComic(comic1);
        c1pg2 = new Page(2L, "src/main/images/mech-bros-images/Noxcomic_pg02_02.png", 2);
        c1pg2.setComic(comic1);
        c1pg3 = new Page(3L, "src/main/images/mech-bros-images/Noxcomic_pg03_05.png", 3);
        c1pg3.setComic(comic1);
    }

    @Test
    public void getAllComics_success() throws Exception {
        when(comicService.getAllComics()).thenReturn(List.of(comic1, comic2, comic3));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/comics")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.data",hasSize(3)))
                .andExpect(jsonPath("$.message").value("success"))
                .andDo(print());
    }

    @Test
    public void getComic_success() throws Exception {
        when(comicService.getComic(comic1.getId())).thenReturn(comic1);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/comics/{comicId}", "1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.data.id").value(comic1.getId()))
                .andExpect(jsonPath("$.data.title").value(comic1.getTitle()))
                .andExpect(jsonPath("$.data.description").value(comic1.getDescription()))
                .andExpect(jsonPath("$.message").value("success"))
                .andDo(print());
    }

    @Test
    public void getComicPages_success() throws Exception{
        when(comicService.getComicPages(comic1.getId())).thenReturn(List.of(c1pg1,c1pg2,c1pg3));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/comics/{comicId}/pages", "1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.data",hasSize(3)))
                .andExpect(jsonPath("$.message").value("success"))
                .andDo(print());
    }

    @Test
    public void getComicPage_success() throws Exception {
        when(comicService.getComicPage(comic1.getId(), c1pg1.getId())).thenReturn(c1pg1);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/comics/{comicId}/pages/{pageId}", "1", "1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.data.id").value(c1pg1.getId()))
                .andExpect(jsonPath("$.data.pageNumber").value(c1pg1.getPageNumber()))
                .andExpect(jsonPath("$.data.url").value(c1pg1.getUrl()))
                .andExpect(jsonPath("$.message").value("success"))
                .andDo(print());
    }
}
