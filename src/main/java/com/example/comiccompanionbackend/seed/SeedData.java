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

        Page mbpg1 = new Page();
        mbpg1.setPageNumber(1);
        mbpg1.setUrl("mech-bros-images/Noxcomic_pg01_02.png");

        Page mbpg2 = new Page();
        mbpg1.setPageNumber(2);
        mbpg1.setUrl("mech-bros-images/Noxcomic_pg02_02.png");

        Page mbpg3 = new Page();
        mbpg1.setPageNumber(3);
        mbpg1.setUrl("mech-bros-images/Noxcomic_pg03_05.png");

        Page mbpg4 = new Page();
        mbpg1.setPageNumber(4);
        mbpg1.setUrl("mech-bros-images/Noxcomic_pg04_05.png");

        //RED RANGER
        Comic redRanger = new Comic();
        redRanger.setTitle("Red Ranger");
        redRanger.setDescription("Red Ranger description Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cum, mollitia. Neque quibusdam impedit corrupti perferendis! Voluptatum accusamus rerum adipisci ea excepturi inventore, vel magni porro blanditiis consectetur debitis fugit molestias!");
        comicRepository.save(redRanger);

        Page rrpg1 = new Page();
        rrpg1.setPageNumber(1);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_001.png");
        pageRepository.save(rrpg1);

        Page rrpg2 = new Page();
        rrpg1.setPageNumber(2);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_002.png");
        pageRepository.save(rrpg2);

        Page rrpg3 = new Page();
        rrpg1.setPageNumber(3);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_003.png");
        pageRepository.save(rrpg3);

        Page rrpg4 = new Page();
        rrpg1.setPageNumber(4);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_004.png");
        pageRepository.save(rrpg4);

        Page rrpg5 = new Page();
        rrpg1.setPageNumber(5);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_005.png");
        pageRepository.save(rrpg5);

        Page rrpg6 = new Page();
        rrpg1.setPageNumber(6);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_006.png");
        pageRepository.save(rrpg6);

        Page rrpg7 = new Page();
        rrpg1.setPageNumber(7);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_007.png");
        pageRepository.save(rrpg7);

        Page rrpg8 = new Page();
        rrpg1.setPageNumber(8);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_008.png");
        pageRepository.save(rrpg8);

        //TWO SISTERS
        Comic twoSisters = new Comic();
        twoSisters.setTitle("The Tale of Two Sisters");
        twoSisters.setDescription("MechBros description Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cum, mollitia. Neque quibusdam impedit corrupti perferendis! Voluptatum accusamus rerum adipisci ea excepturi inventore, vel magni porro blanditiis consectetur debitis fugit molestias!");
        comicRepository.save(twoSisters);
    }
}
