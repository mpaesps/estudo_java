package aplicacao;

import entidades.Inquilino;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPensao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Inquilino[] vet = new Inquilino[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Rent # " + i + ": ");
            String name = sc.nextLine();
            String email = sc.nextLine();
            int room = sc.nextInt();
            vet[room] = new Inquilino(name,email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i<10; i++) {
            if (vet[i] != null) {
                System.out.println(i + ": " + vet[i]);
            }
        }
        sc.close();
    }

}
