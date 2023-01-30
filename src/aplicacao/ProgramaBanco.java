package aplicacao;

import entidades.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaBanco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc = new Scanner(System.in);
        String titularConta = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n)");
        char res = sc.next().charAt(0);
        ContaBancaria contabancaria = new ContaBancaria(numeroConta, titularConta);
        if (res == 'y' || res == 'Y') {
            System.out.println("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            contabancaria = new ContaBancaria(numeroConta, titularConta, depositoInicial);
        }else {
            contabancaria = new ContaBancaria(numeroConta, titularConta);
        }
        System.out.println();
        System.out.println("Account data:" + contabancaria);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double montate = sc.nextDouble();
        contabancaria.depositar(montate);

        System.out.println();
        System.out.println("Updated account data:" + contabancaria);
        System.out.println();

        System.out.println("Enter a withdraw value: ");
        double montante = sc.nextDouble();
        contabancaria.sacar(montante);

        System.out.println();
        System.out.println("Updated account data:" + contabancaria);
        System.out.println();

        sc.close();
    }
}
