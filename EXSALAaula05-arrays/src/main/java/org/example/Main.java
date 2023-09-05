package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Escola escola = new Escola();
        escola.nome = "Escola do Paulo";
        escola.endereco = "Rua do Paulo";
        escola.numTelefone = "00000";
        escola.email = "escola@gmail.com.br";

        boolean controle = true;

        while (controle) {
            System.out.println("BEM VINDO AO SISTEMA DE CADASTRO DA ESCOLA");
            System.out.println("1- Adicionar Alunos");
            System.out.println("2- Mostrar informacoes");
            System.out.println("3- Mostrar quantiade de alunos por ano");
            System.out.println("4- Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Estudante aluno = new Estudante();

                    System.out.println("Nome do aluno: ");
                    aluno.nome = sc.nextLine();
                    System.out.println("Idade do aluno: ");
                    aluno.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ano em que estuda: ");
                    aluno.anoLetivo = sc.nextLine();
                    escola.addEstudante(aluno);
                    break;
                case 2:
                    escola.mostrarInfos();
                    break;
                case 3:
                    escola.qtdEstudanteAno();
                    break;
                case 4:
                    controle = false;
                    break;
                default:
                    System.out.println("Opcao invalida!!!");
                    break;
            }
        }
    }
}