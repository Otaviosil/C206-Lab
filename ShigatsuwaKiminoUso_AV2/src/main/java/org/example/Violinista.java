package org.example;

public class Violinista extends Musico implements Som {
    private String marcaBreu;
    private boolean usaEspaleira;

    @Override
    public void tocar() {
        System.out.println("O violinista " + nome + " esta tocando " + musica);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("---INFORMACOES DO VIOLINISTA---");
        System.out.println("Marca do Breu: " + marcaBreu);
        System.out.println("Usa espaleira: " + usaEspaleira);
        super.mostrarInfo();
    }

    @Override
    public void desafinar() {
        float pontuacao;
        pontuacao = getPontuacao();
        if (usaEspaleira == true) {
            pontuacao = (float) (pontuacao - (pontuacao * 0.05));
            System.out.println("Pontuacao final: " + pontuacao);
        } else {
            pontuacao = (float) (pontuacao - (pontuacao * 0.10));
            System.out.println("Pontuacao final: " + pontuacao);
        }
    }

    public String getMarcaBreu() {
        return marcaBreu;
    }

    public void setMarcaBreu(String marcaBreu) {
        this.marcaBreu = marcaBreu;
    }

    public boolean getUsaEspaleira() {
        return usaEspaleira;
    }

    public void setUsaEspaleira(boolean usaEspaleira) {
        this.usaEspaleira = usaEspaleira;
    }

}
