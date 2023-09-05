package C206_L4_AV1_2023_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estante estante = new Estante();
        Autor autor = new Autor();
        boolean controle = true;

        estante.idEstante = 145;
        estante.letra = 'A';

        autor.nome = "Referson";
        autor.anoNascimento = 2000;
        autor.profissao = "Mecanico";

        while (controle) {
            System.out.println("BEM VINDO AO SISTEMA DE CONTROLE DE LIVROS E ESTANTES");
            System.out.println("1- Adicionar livros a estante");
            System.out.println("2- Mostrar informacoes da estante e dos livros que estao nela");
            System.out.println("3- Apresentar porcentagem de livros de tal genero literario");
            System.out.println("4- Apresentar informacoes do livro e do autor com mais e menos paginas");
            System.out.println("5- Sair do sistema");
            int opcao = sc.nextInt();
            Livro livro1 = new Livro();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    // Informacoes do livro
                    System.out.println("Titulo do livro: ");
                    livro1.titulo = sc.nextLine();
                    System.out.println("Genero literario: ");
                    livro1.genLiterario = sc.nextLine();
                    System.out.println("Quantidade de folhas: ");
                    livro1.qtdFolhas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Editora: ");
                    livro1.editora = sc.nextLine();
                    estante.addLivros(livro1);
                    break;
                case 2:
                    if (livro1 != null) {
                        estante.mostrarInfos();
                    }
                    break;
                case 3:
                    System.out.println("Possiveis generos: drama, suspense, acao, aventura");
                    estante.porcentagemGen();
                    break;
                case 4:
                    System.out.println("*********************************");
                    System.out.println("Autor dos livros: ");
                    autor.mostrarInfos();
                    estante.livroMaisEMenosPag();
                    System.out.println("*********************************");
                    break;
                case 5:
                    controle = false;
                    break;
                default:
                    System.out.println("Opcao invalida!!!!!!!!");
                    break;
            }
        }

    }
}
