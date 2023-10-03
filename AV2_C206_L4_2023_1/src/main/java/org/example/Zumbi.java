package org.example;

public class Zumbi extends Personagem implements Infectar, Lutar {
    private int diasInfeccao;
    private boolean cego;

    @Override
    public void mostrarInfos() {
        System.out.println("---INFORMACOES DO ZUMBI---");
        if (diasInfeccao >= 2 && diasInfeccao < 14)
            System.out.println("Este zumbi é um corredor");
        else if (diasInfeccao >= 14 && diasInfeccao > 365)
            System.out.println("Este zumbi é um perseguidor");
        else if (diasInfeccao >= 365)
            System.out.println("Este zubmi é um estalador");
        System.out.println("dias de infeccao: " + this.diasInfeccao);
        System.out.println("o zumbi enxerga: " + this.cego);
        super.mostrarInfos();
    }

    public void transformacao() {
        if (diasInfeccao >= 2 && diasInfeccao < 14)
            this.cego = false;
        else if (diasInfeccao >= 14 && diasInfeccao > 365)
            this.cego = false;
        else if (diasInfeccao >= 365)
            this.cego = true;
    }

    @Override
    public void defender() {
        System.out.println("O zumbi defendeu um ataque!");
    }

    @Override
    public void atacar() {
        System.out.println("O zumbi esta atacando!");
    }

    @Override
    public void infectou() {
        System.out.println("O zumbi mordou e infectou um Humano.");
    }

}
