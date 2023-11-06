package org.example;

public class Filme implements Comparable<Filme> {
    private String nomeFilme;
    private String generoFilme;
    private int duracaoMin;

    @Override
    public int compareTo(Filme film) {
        return this.nomeFilme.compareTo(film.nomeFilme);
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

}
