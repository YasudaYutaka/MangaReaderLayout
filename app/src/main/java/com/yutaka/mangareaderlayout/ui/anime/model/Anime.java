package com.yutaka.mangareaderlayout.ui.anime.model;

public class Anime {

    public Anime() {
    }

    public Anime(String nomeAnime, String episodioAnime, int imagemAnime) {
        this.nomeAnime = nomeAnime;
        this.episodioAnime = episodioAnime;
        this.imagemAnime = imagemAnime;
    }

    private String nomeAnime, episodioAnime;
    private int imagemAnime;

    public String getNomeAnime() {
        return nomeAnime;
    }

    public void setNomeAnime(String nomeAnime) {
        this.nomeAnime = nomeAnime;
    }

    public String getEpisodioAnime() {
        return episodioAnime;
    }

    public void setEpisodioAnime(String episodioAnime) {
        this.episodioAnime = episodioAnime;
    }

    public int getImagemAnime() {
        return imagemAnime;
    }

    public void setImagemAnime(int imagemAnime) {
        this.imagemAnime = imagemAnime;
    }
}
