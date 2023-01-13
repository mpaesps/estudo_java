import java.util.Scanner;

/*3. Programa em Java que mostra os números pares e ímpares
Escreva um aplicativo em Java que recebe inteiro e mostra
os números pares e ímpares (separados), de 1 até esse inteiro.*/
public class atividade_29_pares_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int n = numero;
        int cont = 0;
        System.out.println("pares");
        while (cont <= numero) {
            if (numero % 2 == 0)
                System.out.println(numero);
            numero--;
        }
        System.out.println("impares");
        while (cont <= n) {
            if (n % 2 != 0)
                System.out.println(n);
            n--;
        }
    }
}