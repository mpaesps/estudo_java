import java.util.Scanner;

public class atividade_33_valores_intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int in = 0, out = 0;

        for (int i = 0; i < num; i++) {
            int num2 = sc.nextInt();
            if (num2 >= 10 && num2 <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.format("in = %d", in);
        System.out.format("\nout = %d", out);

        sc.close();
    }
}
