package org.example;

public class Pianista extends Musico implements Tecnica, Tempo {
    private float alturaBanco;

    @Override
    public void tocar() {
        System.out.println("O pianista " + nome + " esta tocando " + musica);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("---INFORMACOES DO PIANISTA---");
        System.out.println("Altura do banco: " + alturaBanco);
        super.mostrarInfo();
    }

    @Override
    public void tocarAcorde() {
        System.out.println("O pianista tocou um acorde");
    }

    @Override
    public void errarPausa() {
        float pontuacao;
        pontuacao = getPontuacao();
        pontuacao = pontuacao - 25;
        System.out.println("Pontuacao final: " + pontuacao);
        System.out.println("O pianista vai recomeçar a musica");
    }

    public float getAlturaBanco() {
        return alturaBanco;
    }

    public void setAlturaBanco(float alturaBanco) {
        this.alturaBanco = alturaBanco;
    }
}
