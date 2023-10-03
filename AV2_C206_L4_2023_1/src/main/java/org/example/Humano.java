package org.example;

public class Humano extends Personagem implements Aprimorar, Lutar {
    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;

    @Override
    public void mostrarInfos() {
        System.out.println("---INFORMACOES DO HUMANO---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energia);
        System.out.println("Distancia de escuta: " + this.distanciaEscuta);
        super.mostrarInfos();
        System.out.println("---INFORMACOES DA ARMA---");
        System.out.println("Tipo: " + tipodaArma);
        System.out.println("Forca: " + forcadaArma);
    }

    int forcadaArma;
    String tipodaArma;

    public void addArma(Arma arma) {
        this.tipodaArma = arma.getTipoArma();
        this.forcadaArma = arma.getForca();
    }

    @Override
    public void modificarArma() {
        forcadaArma = (forcadaArma + 5);
        System.out.println("Nova forca da arma: " + forcadaArma);
    }

    @Override
    public void modificarHabilidade(int qtdPilulas, String tipoHabilidade) {
        if (qtdPilulas <= 0)
            System.out.println("Quantidade de pílulas inválidas, favor informar um valor maior que 0");
        else if (qtdPilulas < 10) {
            if (tipoHabilidade == energia)
                this.energia = energia + (energia * 0.02);
            else
                this.distanciaEscuta = (distanciaEscuta + 0.2);
        } else if (tipoHabilidade == energia)
            this.energia = energia + (energia * 0.04)
        else
            this.distanciaEscuta = (distanciaEscuta + 0.5);
    }

    @Override
    public void atacar() {
        System.out.println("O humano esta atacando!");
        System.out.println(nome + " esta usando a arma " + tipodaArma);
    }

    @Override
    public void defender() {
        System.out.println("O humano defendeu um ataque!");
    }

}
