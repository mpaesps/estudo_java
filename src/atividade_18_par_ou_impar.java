import org.w3c.dom.ls.LSOutput;
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
import java.util.Scanner;

public class atividade_18_par_ou_impar {
    public static void main(String[] args) {

        System.out.println("Digite um número ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("o numero é par");
        }else {
            System.out.println("o numero é impar");
        }
    }
}
