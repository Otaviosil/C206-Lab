package org.example;

public class Main {
    public static void main(String[] args) {
        Competicao competicao = new Competicao();

        Instrumento inst1 = new Instrumento();
        inst1.setModelo("Haward");
        inst1.setCor("Vermelho");
        inst1.setAno(2005);

        Instrumento inst2 = new Instrumento();
        inst2.setModelo("Ballin");
        inst2.setCor("Marrom");
        inst2.setAno(1980);

        Instrumento inst3 = new Instrumento();
        inst3.setModelo("Heringer");
        inst3.setCor("Preto");
        inst3.setAno(2011);

        Cellista cellista = new Cellista();
        cellista.setNome("Tom");
        cellista.setIdade(20);
        cellista.setMusica("Hooper");
        cellista.setPontuacao(100);
        cellista.setSentado(false);
        cellista.instrumento = inst1;

        Violinista violinista = new Violinista();
        violinista.setNome("Jerry");
        violinista.setIdade(25);
        violinista.setMusica("Oblivion");
        violinista.setMarcaBreu("Harlison");
        violinista.setPontuacao(100);
        violinista.setUsaEspaleira(false);
        violinista.instrumento = inst2;

        Pianista pianista = new Pianista();
        pianista.setNome("Spike");
        pianista.setIdade(30);
        pianista.setMusica("Field");
        pianista.setPontuacao(100);
        pianista.setAlturaBanco(21.5f);
        pianista.instrumento = inst3;

        competicao.addMusico(cellista);
        competicao.addMusico(violinista);
        competicao.addMusico(pianista);

        competicao.listarCompetidores();

    }
}