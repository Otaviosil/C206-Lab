package org.example;

public class DuracaoFilmeException extends Exception {
    public DuracaoFilmeException() {
        System.out.println("Não é permitido cadastrar veículos com ano de lançamento nulo, ou menor que 0");
    }
}
