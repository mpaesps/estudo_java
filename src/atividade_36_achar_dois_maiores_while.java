import java.util.Scanner;

public class atividade_36_achar_dois_maiores_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        int numero,smaior = 0,maior = 0;

        while (cont <= 10){
            numero = sc.nextInt();
            if (numero>maior){
                smaior = maior;
                maior = numero;
            } else if (numero > smaior && numero != maior) {
                smaior = numero;
            }
            cont++;
        }
        System.out.println(maior);
        System.out.println(smaior);
    }
}
