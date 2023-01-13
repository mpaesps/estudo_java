import java.util.Scanner;

public class atividade_25_sistema_cartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        while (x != 0 || y != 0) {


            if (x > 0 & y > 0) {
                System.out.println("o valor esta  no quadrante 1");
            } else if (x < 0 & y > 0) {
                System.out.println("o valor esta  no quadrante 2");
            } else if (x < 0 & y < 0) {
                System.out.println("o valor esta  no quadrante 3");
            } else if (x > 0 & y < 0) {
                System.out.println("o valor esta  no quadrante 4");

            }
            x = sc.nextFloat();
            y = sc.nextFloat();
        }
        sc.close();
    }
}
