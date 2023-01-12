import java.util.Scanner;

public class atividade_21_conta_pagar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o codigo da comida que deseja \n1-hotdog\n2-x-salada\n3-x-bacon\n4-torrada\n5-refrigerante");
        int opcao = sc.nextInt();
        System.out.println("digite a quantidade");
        int quantidade = sc.nextInt();

        String comida;

        switch (opcao) {

            case 1:
                comida = "Hot-Dog";
                double valor = 4;
                double total = valor*quantidade;
                System.out.println("o valor é " + total);
                break;
            case 2:
                comida = "X-Salada";
                valor = 4.5;
                total = valor*quantidade;
                System.out.println("o valor é " + total);
                break;
            case 3:
                comida = "X-Bacon";
                valor=5;
                total = valor*quantidade;
                System.out.println("o valor é " + total);
                break;
            case 4:
                comida = "Torrada";
                valor=2;
                total = valor*quantidade;
                System.out.println("o valor é " + total);
                break;
            case 5:
                comida = "Refrigerante";
                valor=1.5;
                total = valor*quantidade;
                System.out.println("o valor é " + total);
                break;

            default:
                comida = "Comida Inválida";
                break;


        }
        sc.close();
    }
}
