import java.util.Scanner;

public class atividade_31_achar_maior_numero_while {
    public static void main(String[] args) {
        System.out.println("digite dez numeros ");
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        int maior = 1;

        while (cont <= 10){
            int numero = sc.nextInt();
            if (numero > maior){
                maior = numero;
            }
            cont++;
        }
        System.out.format("O maior numero é %d", maior);
    }
}
