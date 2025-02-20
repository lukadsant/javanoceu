package javadojo.maratona.sobrecarga.test;

import javadojo.maratona.sobrecarga.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Monogatari");
        anime.init("hunterxhunter","tv",12,"shounnen");
        anime.imprime();
    }
}
