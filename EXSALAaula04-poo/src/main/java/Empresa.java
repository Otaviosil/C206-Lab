public class Empresa {
    String nome;

    // Fazendo a composição dos objetos
    // Departamento dep = new Departamento(); // Objeto
    Departamento dep; // Referência para um objeto
    Funcionario func; // Referência para o objeto do funcionário (Agregação)

    // Outra forma de fazer a composição
    public Empresa(String nomeDaEmpresa) {
        this.nome = nomeDaEmpresa;
        dep = new Departamento(); // Composição
    }

    // Apresentar as informações
    public void mostraInfos() {
        System.out.println("Nome da empresa: " + nome);
        System.out.println("Função do departamento: " + dep.funcao);
        System.out.println("Funcionários ");
        System.out.println("Nome: " + func.nome);
    }

    // Agregação
    public void registrarFuncionario(Funcionario funcionario) {
        this.func = funcionario;
    }
}