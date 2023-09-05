package C206_L4_AV1_2023_1;

public class Livro {
    String titulo;
    String genLiterario;
    int qtdFolhas;
    String editora;
    Autor autor;

    public Livro() {
        autor = new Autor();
    }

    void mostrarInfos() {
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Genero literario: " + genLiterario);
        System.out.println("Quantidade de folhas: " + qtdFolhas);
        System.out.println("Editora: " + editora);
    }

}
