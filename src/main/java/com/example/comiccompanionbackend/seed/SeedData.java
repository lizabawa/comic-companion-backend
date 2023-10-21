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
        mechBros.setDescription("MechBros description Lorem ipsum dolor sit amet");
        comicRepository.save(mechBros);

        Page mbpg1 = new Page();
        mbpg1.setPageNumber(1);
        mbpg1.setUrl("mech-bros-images/Noxcomic_pg01_02.png");
        mbpg1.setComic(mechBros);
        pageRepository.save(mbpg1);

        Page mbpg2 = new Page();
        mbpg2.setPageNumber(2);
        mbpg2.setUrl("mech-bros-images/Noxcomic_pg02_02.png");
        mbpg2.setComic(mechBros);
        pageRepository.save(mbpg2);

        Page mbpg3 = new Page();
        mbpg3.setPageNumber(3);
        mbpg3.setUrl("mech-bros-images/Noxcomic_pg03_05.png");
        mbpg3.setComic(mechBros);
        pageRepository.save(mbpg3);

        Page mbpg4 = new Page();
        mbpg4.setPageNumber(4);
        mbpg4.setUrl("mech-bros-images/Noxcomic_pg04_05.png");
        mbpg4.setComic(mechBros);
        pageRepository.save(mbpg4);

        //RED RANGER
        Comic redRanger = new Comic();
        redRanger.setTitle("Red Ranger");
        redRanger.setDescription("Red Ranger description Lorem ipsum dolor");
        comicRepository.save(redRanger);

        Page rrpg1 = new Page();
        rrpg1.setPageNumber(1);
        rrpg1.setUrl("red-ranger-images/RedRanger_comic_001.png");
        rrpg1.setComic(redRanger);
        pageRepository.save(rrpg1);

        Page rrpg2 = new Page();
        rrpg2.setPageNumber(2);
        rrpg2.setUrl("red-ranger-images/RedRanger_comic_002.png");
        rrpg2.setComic(redRanger);
        pageRepository.save(rrpg2);

        Page rrpg3 = new Page();
        rrpg3.setPageNumber(3);
        rrpg3.setUrl("red-ranger-images/RedRanger_comic_003.png");
        rrpg3.setComic(redRanger);
        pageRepository.save(rrpg3);

        Page rrpg4 = new Page();
        rrpg4.setPageNumber(4);
        rrpg4.setUrl("red-ranger-images/RedRanger_comic_004.png");
        rrpg4.setComic(redRanger);
        pageRepository.save(rrpg4);

        Page rrpg5 = new Page();
        rrpg5.setPageNumber(5);
        rrpg5.setUrl("red-ranger-images/RedRanger_comic_005.png");
        rrpg5.setComic(redRanger);
        pageRepository.save(rrpg5);

        Page rrpg6 = new Page();
        rrpg6.setPageNumber(6);
        rrpg6.setUrl("red-ranger-images/RedRanger_comic_006.png");
        rrpg6.setComic(redRanger);
        pageRepository.save(rrpg6);

        Page rrpg7 = new Page();
        rrpg7.setPageNumber(7);
        rrpg7.setUrl("red-ranger-images/RedRanger_comic_007.png");
        rrpg7.setComic(redRanger);
        pageRepository.save(rrpg7);

        Page rrpg8 = new Page();
        rrpg8.setPageNumber(8);
        rrpg8.setUrl("red-ranger-images/RedRanger_comic_008.png");
        rrpg8.setComic(redRanger);
        pageRepository.save(rrpg8);

        //TWO SISTERS
        Comic twoSisters = new Comic();
        twoSisters.setTitle("The Tale of Two Sisters");
        twoSisters.setDescription("MechBros description Lorem ipsum dolor sit amet");
        comicRepository.save(twoSisters);

        Page tspg1 = new Page();
        tspg1.setPageNumber(1);
        tspg1.setUrl("two-sisters-images/Renowned_p01_01.png");
        tspg1.setComic(twoSisters);
        pageRepository.save(tspg1);

        Page tspg2 = new Page();
        tspg2.setPageNumber(2);
        tspg2.setUrl("two-sisters-images/Renowned_p02_01.png");
        tspg2.setComic(twoSisters);
        pageRepository.save(tspg2);

        Page tspg3 = new Page();
        tspg3.setPageNumber(3);
        tspg3.setUrl("two-sisters-images/Renowned_p03_06.png");
        tspg3.setComic(twoSisters);
        pageRepository.save(tspg3);

        Page tspg4 = new Page();
        tspg4.setPageNumber(4);
        tspg4.setUrl("two-sisters-images/Renowned_p04_04.png");
        tspg4.setComic(twoSisters);
        pageRepository.save(tspg4);
    }
}
