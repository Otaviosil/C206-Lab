package org.example;

public class Cidade {
    Personagem personagem;

    public Cidade() {
        personagem = new Personagem();
    }
    private String nome;
    private Personagem[] personagens = new Personagem[2];

    public void adicionarPersonagens(Personagem p) {
        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] == null) {
                personagens[i] = p;
                break;
            }
        }
    }

    public void listarPersonagens() {
        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] != null) {
                if (personagens[i] instanceof Humano) {
                    Humano auxHumano = (Humano) personagens[i];
                    auxHumano.mostrarInfos();
                    auxHumano.defender();
                    auxHumano.atacar();
                    auxHumano.modificarArma();
                } else {
                    Zumbi auxZumbi = (Zumbi) personagens[i];
                    auxZumbi.transformacao();
                    auxZumbi.mostrarInfos();
                    auxZumbi.defender();
                    auxZumbi.atacar();
                    auxZumbi.infectou();
                }
                System.out.println("Quantidade de personagens: " + personagem.getNumPersonagens());
            }
        }
    }

}
