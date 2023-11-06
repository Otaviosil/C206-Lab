package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arquivo arq = new Arquivo();
        Scanner sc = new Scanner(System.in);
        boolean executando = true;
        Filme filme = new Filme();

        while (executando) {
            System.out.println("+++ BEM VINDO AO MENU DE CADASTRO DE FILMES +++");
            System.out.println("1 - Cadastrar Filmes");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Listar Filmes em ordem A - Z");
            System.out.println("4 - Listar Filmes em ordem Z - A");
            System.out.println("5 - Sair");
            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<Filme> filmes = arq.lerArquivos();

            switch (op) {
                case 1:
                    System.out.println("Nome do filme: ");
                    filme.setNomeFilme(sc.nextLine());
                    System.out.println("Genero do filme: ");
                    filme.setGeneroFilme(sc.nextLine());

                    try {
                        System.out.println("Duracao do filme: ");
                        filme.setDuracaoMin(sc.nextInt());
                        if (filme.getDuracaoMin() <= 0) {
                            throw new DuracaoFilmeException();
                        }
                    } catch (Exception e) {
                        break;
                    }
                    arq.escreverArquivo(filme);
                    break;
                case 2:
                    System.out.println("INFORMACOES DOS FILMES");
                    for (int i = 0; i < filmes.size(); i++) {
                        System.out.println("Nome: " + filmes.get(i).getNomeFilme());
                        System.out.println("Genero: " + filmes.get(i).getGeneroFilme());
                        System.out.println("Duracao: " + filmes.get(i).getDuracaoMin());
                    }
                    break;
                case 3:
                    Collections.sort(filmes);
                    System.out.println("INFORMACOES DOS FILMES");
                    for (int i = 0; i < filmes.size(); i++) {
                        System.out.println("Nome: " + filmes.get(i).getNomeFilme());
                        System.out.println("Genero: " + filmes.get(i).getGeneroFilme());
                        System.out.println("Duracao: " + filmes.get(i).getDuracaoMin());
                    }
                    break;
                case 4:
                    Collections.sort(filmes);
                    Collections.reverse(filmes);
                    System.out.println("INFORMACOES DOS FILMES");
                    for (int i = 0; i < filmes.size(); i++) {
                        System.out.println("Nome: " + filmes.get(i).getNomeFilme());
                        System.out.println("Genero: " + filmes.get(i).getGeneroFilme());
                        System.out.println("Duracao: " + filmes.get(i).getDuracaoMin());
                    }
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

    }
}