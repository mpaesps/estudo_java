import java.util.Scanner;

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão
 do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"*/
public class atividade_35_divisoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double n1 = sc.nextInt();
            double n2 = sc.nextInt();

            if (n2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = n1 / n2;
                System.out.println(resultado);
            }
        }
    }
}
