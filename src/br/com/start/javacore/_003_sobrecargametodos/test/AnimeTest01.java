package br.com.start.javacore._003_sobrecargametodos.test;

import br.com.start.javacore._003_sobrecargametodos.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudava Drive", "TV", 12);
        anime.imprime();
        anime.init("Akudava Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
