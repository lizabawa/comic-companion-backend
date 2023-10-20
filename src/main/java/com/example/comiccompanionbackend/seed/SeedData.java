package com.example.comiccompanionbackend.seed;

import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
import com.example.comiccompanionbackend.repository.ComicRepository;
import com.example.comiccompanionbackend.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {
    private ComicRepository comicRepository;
    private PageRepository pageRepository;

    @Autowired
    public SeedData(ComicRepository comicRepository, PageRepository pageRepository) {
        this.comicRepository = comicRepository;
        this.pageRepository = pageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //MECH BROS
        Comic mechBros = new Comic();
        mechBros.setTitle("Mech Bros");
        mechBros.setDescription("MechBros description Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cum, mollitia. Neque quibusdam impedit corrupti perferendis! Voluptatum accusamus rerum adipisci ea excepturi inventore, vel magni porro blanditiis consectetur debitis fugit molestias!");
        comicRepository.save(mechBros);

        //RED RANGER
        Comic redRanger = new Comic();
        redRanger.setTitle("Red Ranger");
        redRanger.setDescription("Red Ranger description Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cum, mollitia. Neque quibusdam impedit corrupti perferendis! Voluptatum accusamus rerum adipisci ea excepturi inventore, vel magni porro blanditiis consectetur debitis fugit molestias!");
        comicRepository.save(redRanger);

        Page rrpg1 = new Page();
        rrpg1.setPageNumber(1);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_001.png");

        Comic twoSisters = new Comic();
        twoSisters.setTitle("The Tale of Two Sisters");
        twoSisters.setDescription("MechBros description Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cum, mollitia. Neque quibusdam impedit corrupti perferendis! Voluptatum accusamus rerum adipisci ea excepturi inventore, vel magni porro blanditiis consectetur debitis fugit molestias!");
        comicRepository.save(twoSisters);
    }
}
