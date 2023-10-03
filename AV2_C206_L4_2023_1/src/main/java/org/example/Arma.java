package org.example;

public class Arma {
    Humano humano;
    private int forca;
    private String tipoArma;

    public void mostrarInfos() {
        System.out.println("INFORMACOES DA ARMA");
        System.out.println("Tipo: " + tipoArma);
        System.out.println("Forca: " + forca);
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public int getForca() {
        return forca;
    }

    public String getTipoArma() {
        return tipoArma;
    }
}
