import java.util.Scanner;

public class atividade_38_quadrado_e_cubo_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n+1; i++) {
            System.out.format("%d %d %d",i, i*i, i*i*i);
            System.out.println("\n");
        }

    }
}
