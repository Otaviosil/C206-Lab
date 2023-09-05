package org.example;

public class Escola {
    String nome;
    String email;
    String numTelefone;
    String endereco;

    Estudante[] estudantes = new Estudante[301];

    void addEstudante(Estudante e) {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == null) {
                estudantes[i] = e;
                break;
            }
        }
    }

    void qtdEstudanteAno() {
        int alunosPrimeiro = 0;
        int alunosSegundo = 0;
        int alunosTerceiro = 0;

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i].anoLetivo.equalsIgnoreCase("Primeiro"))
                    alunosPrimeiro++;
                else if (estudantes[i].anoLetivo.equalsIgnoreCase("Segundo"))
                    alunosSegundo++;
                else
                    alunosTerceiro++;
            }
        }

        System.out.println("ALUNOS POR ANO");
        System.out.println("Primeiro ano: "+alunosPrimeiro+" alunos");
        System.out.println("Segundo ano: "+alunosSegundo+" alunos");
        System.out.println("Terceiro ano: "+alunosTerceiro+" alunos");
    }

    void mostrarInfos() {
        System.out.println("Nome da escola: " + nome);
        System.out.println("Email da escola: " + email);
        System.out.println("Numero de telefone da escola: " + numTelefone);
        System.out.println("Endereco da escola: " + endereco);
    }

}
