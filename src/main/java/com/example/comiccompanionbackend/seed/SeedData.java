package com.example.comiccompanionbackend.seed;

import com.example.comiccompanionbackend.model.Comic;
import com.example.comiccompanionbackend.model.Page;
import com.example.comiccompanionbackend.repository.ComicRepository;
import com.example.comiccompanionbackend.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

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
        mechBros.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/mech-bros.png?raw=true");
        comicRepository.save(mechBros);

        Page mbpg1 = new Page();
        mbpg1.setPageNumber(1);
        mbpg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/Noxcomic_pg01_02.png?raw=true");
        mbpg1.setComic(mechBros);
        pageRepository.save(mbpg1);

        Page mbpg2 = new Page();
        mbpg2.setPageNumber(2);
        mbpg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/Noxcomic_pg02_02.png?raw=true");
        mbpg2.setComic(mechBros);
        pageRepository.save(mbpg2);

        Page mbpg3 = new Page();
        mbpg3.setPageNumber(3);
        mbpg3.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/Noxcomic_pg03_05.png?raw=true");
        mbpg3.setComic(mechBros);
        pageRepository.save(mbpg3);

        Page mbpg4 = new Page();
        mbpg4.setPageNumber(4);
        mbpg4.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/Noxcomic_pg04_05.png?raw=true");
        mbpg4.setComic(mechBros);
        pageRepository.save(mbpg4);

        mechBros.setPage(List.of(mbpg1, mbpg2, mbpg3, mbpg4));
        comicRepository.save(mechBros);

        //RED RANGER
        Comic redRanger = new Comic();
        redRanger.setTitle("Red Ranger");
        redRanger.setDescription("Red Ranger description Lorem ipsum dolor");
        redRanger.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/red-ranger.png?raw=true");
        comicRepository.save(redRanger);

        Page rrpg1 = new Page();
        rrpg1.setPageNumber(1);
        rrpg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_001.png?raw=true");
        rrpg1.setComic(redRanger);
        pageRepository.save(rrpg1);

        Page rrpg2 = new Page();
        rrpg2.setPageNumber(2);
        rrpg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_002.png?raw=true");
        rrpg2.setComic(redRanger);
        pageRepository.save(rrpg2);

        Page rrpg3 = new Page();
        rrpg3.setPageNumber(3);
        rrpg3.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_003.png?raw=true");
        rrpg3.setComic(redRanger);
        pageRepository.save(rrpg3);

        Page rrpg4 = new Page();
        rrpg4.setPageNumber(4);
        rrpg4.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_004.png?raw=true");
        rrpg4.setComic(redRanger);
        pageRepository.save(rrpg4);

        Page rrpg5 = new Page();
        rrpg5.setPageNumber(5);
        rrpg5.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_005.png?raw=true");
        rrpg5.setComic(redRanger);
        pageRepository.save(rrpg5);

        Page rrpg6 = new Page();
        rrpg6.setPageNumber(6);
        rrpg6.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_006.png?raw=true");
        rrpg6.setComic(redRanger);
        pageRepository.save(rrpg6);

        Page rrpg7 = new Page();
        rrpg7.setPageNumber(7);
        rrpg7.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_007.png?raw=true");
        rrpg7.setComic(redRanger);
        pageRepository.save(rrpg7);

        Page rrpg8 = new Page();
        rrpg8.setPageNumber(8);
        rrpg8.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_008.png?raw=true");
        rrpg8.setComic(redRanger);
        pageRepository.save(rrpg8);

        redRanger.setPage(List.of(rrpg1, rrpg2, rrpg3, rrpg4, rrpg5, rrpg6, rrpg7, rrpg8));
        comicRepository.save(redRanger);

        //TWO SISTERS
        Comic twoSisters = new Comic();
        twoSisters.setTitle("The Tale of Two Sisters");
        twoSisters.setDescription("MechBros description Lorem ipsum dolor sit amet");
        twoSisters.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/two-sisters.png?raw=true");
        comicRepository.save(twoSisters);

        Page tspg1 = new Page();
        tspg1.setPageNumber(1);
        tspg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p01_01.png?raw=true");
        tspg1.setComic(twoSisters);
        pageRepository.save(tspg1);

        Page tspg2 = new Page();
        tspg2.setPageNumber(2);
        tspg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p02_01.png?raw=true");
        tspg2.setComic(twoSisters);
        pageRepository.save(tspg2);

        Page tspg3 = new Page();
        tspg3.setPageNumber(3);
        tspg3.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p03_06.png?raw=true");
        tspg3.setComic(twoSisters);
        pageRepository.save(tspg3);

        Page tspg4 = new Page();
        tspg4.setPageNumber(4);
        tspg4.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p04_04.png?raw=true");
        tspg4.setComic(twoSisters);
        pageRepository.save(tspg4);

        twoSisters.setPage(List.of(tspg1, tspg2, tspg3, tspg4));
        comicRepository.save(twoSisters);

        //Comic 4
        Comic comic4 = new Comic();
        comic4.setTitle("Comic 4");
        comic4.setDescription("Comic 4 description");
        comic4.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/mech-bros.png?raw=true");
        comicRepository.save(comic4);

        Page c4pg1 = new Page();
        c4pg1.setPageNumber(1);
        c4pg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p04_04.png?raw=true");
        c4pg1.setComic(comic4);
        pageRepository.save(c4pg1);

        Page c4pg2 = new Page();
        c4pg2.setPageNumber(2);
        c4pg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_007.png?raw=true");
        c4pg2.setComic(comic4);
        pageRepository.save(c4pg2);

        comic4.setPage(List.of(c4pg1, c4pg2));
        comicRepository.save(comic4);

        //Comic 5
        Comic comic5 = new Comic();
        comic5.setTitle("Comic 5");
        comic5.setDescription("Comic 5 description");
        comic5.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/mech-bros.png?raw=true");
        comicRepository.save(comic5);

        Page c5pg1 = new Page();
        c5pg1.setPageNumber(1);
        c5pg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_007.png?raw=true");
        c5pg1.setComic(comic5);
        pageRepository.save(c5pg1);

        Page c5pg2 = new Page();
        c5pg2.setPageNumber(2);
        c5pg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p04_04.png?raw=true");
        c5pg2.setComic(comic5);
        pageRepository.save(c5pg2);

        comic5.setPage(List.of(c5pg1, c5pg2));
        comicRepository.save(comic5);

        //Comic 6
        Comic comic6 = new Comic();
        comic6.setTitle("Comic 6");
        comic6.setDescription("Comic 6 description");
        comic6.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/mech-bros.png?raw=true");
        comicRepository.save(comic6);

        Page c6pg1 = new Page();
        c6pg1.setPageNumber(1);
        c6pg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_007.png?raw=true");
        c6pg1.setComic(comic6);
        pageRepository.save(c6pg1);

        Page c6pg2 = new Page();
        c6pg2.setPageNumber(2);
        c6pg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p04_04.png?raw=true");
        c6pg2.setComic(comic6);
        pageRepository.save(c6pg2);

        comic6.setPage(List.of(c6pg1, c6pg2));
        comicRepository.save(comic6);

        //Comic 7
        Comic comic7 = new Comic();
        comic7.setTitle("Comic 7");
        comic7.setDescription("Comic 7 description");
        comic7.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/mech-bros.png?raw=true");
        comicRepository.save(comic7);

        Page c7pg1 = new Page();
        c7pg1.setPageNumber(1);
        c7pg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_007.png?raw=true");
        c7pg1.setComic(comic7);
        pageRepository.save(c7pg1);

        Page c7pg2 = new Page();
        c7pg2.setPageNumber(2);
        c7pg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p04_04.png?raw=true");
        c7pg2.setComic(comic7);
        pageRepository.save(c7pg2);

        comic7.setPage(List.of(c7pg1, c7pg2));
        comicRepository.save(comic7);

        //Comic 8
        Comic comic8 = new Comic();
        comic8.setTitle("Comic 8");
        comic8.setDescription("Comic 8 description");
        comic8.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/mech-bros.png?raw=true");
        comicRepository.save(comic8);

        Page c8pg1 = new Page();
        c8pg1.setPageNumber(1);
        c8pg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_007.png?raw=true");
        c8pg1.setComic(comic8);
        pageRepository.save(c8pg1);

        Page c8pg2 = new Page();
        c8pg2.setPageNumber(2);
        c8pg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p04_04.png?raw=true");
        c8pg2.setComic(comic8);
        pageRepository.save(c8pg2);

        comic8.setPage(List.of(c8pg1, c8pg2));
        comicRepository.save(comic8);

        //Comic 9
        Comic comic9 = new Comic();
        comic9.setTitle("Comic 9");
        comic9.setDescription("Comic 9 description");
        comic9.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/mech-bros-images/mech-bros.png?raw=true");
        comicRepository.save(comic9);

        Page c9pg1 = new Page();
        c9pg1.setPageNumber(1);
        c9pg1.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/red-ranger-images/RedRanger_comic_007.png?raw=true");
        c9pg1.setComic(comic9);
        pageRepository.save(c9pg1);

        Page c9pg2 = new Page();
        c9pg2.setPageNumber(2);
        c9pg2.setUrl("https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/two-sisters-images/Renowned_p04_04.png?raw=true");
        c9pg2.setComic(comic9);
        pageRepository.save(c9pg2);

        comic9.setPage(List.of(c9pg1, c9pg2));
        comicRepository.save(comic9);
    }
}
