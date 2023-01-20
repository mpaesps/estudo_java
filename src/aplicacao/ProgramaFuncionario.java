package aplicacao;

import entidades.Funcionario;

import java.util.Scanner;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salário Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Impostos: ");
        funcionario.impostos = sc.nextDouble();

        System.out.println("\nEmpregado: " + funcionario);

        System.out.println("\nQue porcentagem deseja adicionar no salário? ");
        double porcentagem = sc.nextDouble();

        funcionario.aumentarSalario(porcentagem);

        System.out.println("\nDados atualizados: " + funcionario);

    }
}
