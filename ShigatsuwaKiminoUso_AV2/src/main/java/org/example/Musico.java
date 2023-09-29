package org.example;

public abstract class Musico {
    Instrumento instrumento;

    protected static int contador;
    protected int codigo;
    protected String nome;
    protected int idade;
    protected String musica;
    protected int pontuacao;

    Musico() {
        this.contador++;
        this.codigo = contador;
    }

    public abstract void tocar();

    public void mostrarInfo() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Musica: " + this.musica);
        System.out.println("Pontuacao inicial: " + this.pontuacao);
        System.out.println("---INFORMACOES DO INSTRUMENTO---");
        if (instrumento != null) {
            System.out.println("Modelo: " + instrumento.getModelo());
            System.out.println("Cor: " + instrumento.getCor());
            System.out.println("Ano: " + instrumento.getAno());
        }
        System.out.println("---------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

}
