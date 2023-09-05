public class Funcionario {
    // Construtor
    public Funcionario() {
        System.out.println(" NOVO  FUNCIONÁRIO REGISTRADO ");
    }

    // Construtor com sobrecarga de métodos
    public Funcionario(int idade, String cpf, double salario, String nome) {
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.nome = nome;
    }

    // Carectirísticas = Atributos
    int idade; // Idade do funcionário
    String cpf; // Cpf
    double salario; // Salário
    String nome; // Nome do funcionário

    // Ações = Métodos
    public void tirarFerias(int diasDeFerias) {
        // Concatenação
        // O funcionário joãozinho tirou férias por 15 dias
        System.out.println("O funcionário(a) " + nome + " tirou férias por " + diasDeFerias + " dias");
    }

    public double calcularSarioAnual() {
        // Retornar a informação
        double salarioAnual = salario * 12;
        return salarioAnual;
    }

    public double calcularSalarioAnual(double decimoTerceiro) {
        double salarioAnual = (salario * 12) + decimoTerceiro;
        return salarioAnual;
    }
}

