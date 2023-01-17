/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1*/

import java.util.Scanner;

public class atividade_37_calcular_fatorial_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cfatorial = 1;
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            cfatorial *= i;
        }
        System.out.println(cfatorial);
    }
}
