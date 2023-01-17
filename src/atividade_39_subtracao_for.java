import java.util.Scanner;

/*Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração.*/
public class atividade_39_subtracao_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("\ndigite o 1° numero: ");
            int n1 = sc.nextInt();
            System.out.println("digite o 2° numero: ");
            int n2 = sc.nextInt();

            int sub = n1 - n2;
            System.out.format("%d - %d = %d", n1, n2, sub);
        }
    }
}
