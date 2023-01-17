import java.util.Scanner;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste
 consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5*/
public class atividade_34_numero_caso_teste_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasoTeste = sc.nextInt();

        for (int i=0;i<numeroCasoTeste;i++){

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
