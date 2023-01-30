import java.util.Locale;
import java.util.Scanner;

public class atividade_40_revisao_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < n; i++){
            vet[i]= sc.nextDouble();
        }
        double soma = 0.0;
            for (int i = 0; i < n; i++){
               soma+= vet[i];
            }
        double avg = soma / n;
        System.out.printf("media dos pesos %.2f%n", avg);

        sc.close();
    }
}
