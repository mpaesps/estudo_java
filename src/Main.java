import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        double nota_final = n1+n2;
        System.out.printf("Nota final = %.1f%n ", nota_final);

        if(nota_final<60.0){
            System.out.println("REPROVADO");
        }
        else {
            System.out.println("APROVADO");
        }
        sc.close();
    }
}