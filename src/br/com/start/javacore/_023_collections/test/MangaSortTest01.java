package br.com.start.javacore._023_collections.test;

import br.com.start.javacore._023_collections.model.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing Ultimate",19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Attack on titan", 3.2));
        mangas.add(new Manga(3L,"Pokemon", 11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("-------------");
        for (Manga manga : mangas){
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("-------------");
        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
