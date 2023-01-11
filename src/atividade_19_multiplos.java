/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
  Multiplos", indicando se os valores lidos são múltiplos entre si.
  Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.*/

import java.util.Scanner;

public class atividade_19_multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int menor = 0;

        System.out.println("digite o primeiro numero");
            int n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
            int n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("sao multiplos");
        } else {
            System.out.println("nao sao multiplos");
        }
        sc.close();
    }
}
