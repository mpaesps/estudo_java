package aplicacao;

import entidades.CurrencyConverter;

import java.util.Scanner;

public class ProgramaCurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("dollar price: ");
        cc.dollarPrice = sc.nextDouble();
        System.out.println("how many dollars will be bought?");
        cc.dollarBought = sc.nextDouble();
        System.out.println("amount to be paid in reais = " + cc.amount());

    }
}
