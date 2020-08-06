package com.yutaka.mangareaderlayout.ui.manga.model;

public class Manga {

    public Manga() {

    }

    public Manga(String nomeManga, String generoManga, String capituloManga, int capaManga) {
        this.nomeManga = nomeManga;
        this.generoManga = generoManga;
        this.capituloManga = capituloManga;
        this.capaManga = capaManga;
    }

    private String nomeManga, generoManga, capituloManga;
    private int capaManga;

    public String getNomeManga() {
        return nomeManga;
    }

    public void setNomeManga(String nomeManga) {
        this.nomeManga = nomeManga;
    }

    public String getGeneroManga() {
        return generoManga;
    }

    public void setGeneroManga(String generoManga) {
        this.generoManga = generoManga;
    }

    public String getCapituloManga() {
        return capituloManga;
    }

    public void setCapituloManga(String capituloManga) {
        this.capituloManga = capituloManga;
    }

    public int getCapaManga() {
        return capaManga;
    }

    public void setCapaManga(int capaManga) {
        this.capaManga = capaManga;
    }
}
