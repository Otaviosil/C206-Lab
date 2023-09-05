import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Instanciar a classe = Criar o objeto = Criar a entidade
        Funcionario func1 = new Funcionario(); // Instanciei o objeto - Variável de referência
        Funcionario func2 = new Funcionario(32,"000.000.000-90",2800.90,"Samuel"); // Intanciei outro objeto - Usando o construtor
        // Atribuindo valores aos objeto ( Operador de seção )
        func1.nome="Gabriel";
        func1.idade=22;
        func1.salario=7800.90;
        func1.cpf="000.000.000-00";

        /*
        func2.nome="Samuel";
        func2.idade=32;
        func2.salario=2800.90;
        func2.cpf="000.000.000-90";
        */
        // Verificação dos funcionários



        // Chamar os métodos
        /*
        func1.tirarFerias(30);
        func2.tirarFerias(15);
        double salarioAnual = func1.calcularSarioAnual();
        double salarioAnualMaisDecimoTerceiro = func1.calcularSalarioAnual(7800.90);
        System.out.println("Salário anual: "+salarioAnual+"R$");
        System.out.println("Salário anual com décimo terceiro : "+salarioAnualMaisDecimoTerceiro+"R$");
         */

        // Composição
        Scanner sc = new Scanner(System.in); // Entrada de dados
        System.out.println("Nome da empresa: ");
        String nomeDaEmpresa = sc.nextLine();
        System.out.println("Função do departamento: ");
        String funcaoDep = sc.nextLine();

        // Instanciar os objetos
        Empresa emp = new Empresa(nomeDaEmpresa); // Fiz a composição
        emp.dep.funcao = funcaoDep;
        Funcionario func2 = new Funcionario(32,"000.000.000-90",2800.90,"Samuel"); // Intanciei outro objeto - Usando o construtor

        // Agregação
        emp.registrarFuncionario(func2);

        func2.calcularSarioAnual();
        // Chamando o método
        emp.mostraInfos();


    }
}
