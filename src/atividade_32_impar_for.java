/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/

import java.util.Scanner;
public class atividade_32_impar_for {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            int i;
            for (i = 1; i < n + 1; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}