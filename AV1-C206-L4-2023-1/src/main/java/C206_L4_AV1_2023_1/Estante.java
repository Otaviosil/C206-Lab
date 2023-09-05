package C206_L4_AV1_2023_1;

public class Estante {
    int idEstante;
    char letra;
    Livro livro = new Livro();
    Autor autor = new Autor();

    Livro[] livros = new Livro[121];

    void addLivros(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
    }


    void porcentagemGen() {
        int qtdDrama = 0;
        int qtdSuspense = 0;
        int qtdAcao = 0;
        int qtdAventura = 0;
        double qtdTotalPercent = 0;
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].genLiterario.equalsIgnoreCase("drama")) qtdDrama++;
                else if (livros[i].genLiterario.equalsIgnoreCase("suspense")) qtdSuspense++;
                else if (livros[i].genLiterario.equalsIgnoreCase("acao")) qtdAcao++;
                else qtdAventura++;
            }
        }
        qtdTotalPercent += (qtdDrama + qtdSuspense + qtdAcao + qtdAventura);
        System.out.println("Livros de drama: " + ((qtdDrama * qtdTotalPercent) * 100 / (4 * qtdTotalPercent)) + "%");
        System.out.println("Livros de suspense: " + ((qtdSuspense * qtdTotalPercent) * 100 / (4 * qtdTotalPercent)) + "%");
        System.out.println("Livros de acao: " + ((qtdAcao * qtdTotalPercent) * 100 / (4 * qtdTotalPercent)) + "%");
        System.out.println("Livros de aventura: " + ((qtdAventura * qtdTotalPercent) * 100 / (4 * qtdTotalPercent)) + "%");
    }

    void livroMaisEMenosPag() {
        int maisPaginas = 0;
        int menosPaginas = 0;
        double Aux1 = 0;
        double Aux2 = 99999999;

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].qtdFolhas > Aux1) {
                    Aux1 = livros[i].qtdFolhas;
                    maisPaginas = i;
                } else if (livros[i].qtdFolhas < Aux2) {
                    Aux2 = livros[i].qtdFolhas;
                    menosPaginas = i;
                }
            }
        }
        System.out.println("LIVRO E AUTOR COM MAIS PAGINAS: ");
        livros[maisPaginas].mostrarInfos();
        System.out.println("LIVRO E AUTOR COM MENOS PAGINAS: ");
        livros[menosPaginas].mostrarInfos();
    }

    void mostrarInfos() {
        System.out.println("ID da estante: " + idEstante);
        System.out.println("Letra da estante: " + letra);

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) livros[i].mostrarInfos();
        }
    }


}
