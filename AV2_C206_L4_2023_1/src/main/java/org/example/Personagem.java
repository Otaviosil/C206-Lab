package org.example;

public abstract class Personagem {
    private static int numPersonagens;
    private int vida;
    private int idPersonagem;

    public Personagem() {
        this.numPersonagens++;
        idPersonagem = numPersonagens;
    }

    public static int getNumPersonagens() {
        return numPersonagens;
    }

    public void mostrarInfos() {
        System.out.println("Vida: " + vida);
        System.out.println("Id: " + idPersonagem);
    }

}
