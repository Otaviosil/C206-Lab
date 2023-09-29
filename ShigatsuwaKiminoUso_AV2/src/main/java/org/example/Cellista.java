package org.example;

public class Cellista extends Musico implements Som {
    private boolean sentado;

    @Override
    public void tocar() {
        System.out.println("O cellista " + nome + " esta tocando " + musica);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("---INFORMACOES DO CELLISTA---");
        if (sentado == true)
            System.out.println("O violinista esta sentado");
        else
            System.out.println("O violinista esta em pé");
        super.mostrarInfo();
    }

    @Override
    public void desafinar() {
        float pontuacao;
        pontuacao = getPontuacao();
        pontuacao = (float) (pontuacao - (pontuacao * 0.05));
        System.out.println("Pontuacao final: " + pontuacao);
    }

    public boolean getSentado() {
        return sentado;
    }

    public void setSentado(boolean sentado) {
        this.sentado = sentado;
    }

}
