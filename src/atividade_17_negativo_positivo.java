import java.util.Scanner;

public class atividade_17_negativo_positivo {

    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O numero é positivo");
        }
    }
}
