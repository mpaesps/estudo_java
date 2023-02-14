package aplicacao;

import entidades.Elementos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaArrayListSomaElementos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Elementos> elements = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int element = sc.nextInt();
            elements.add(new Elementos(element));
        }

        int sum = 0;
        for (Elementos elementos: elements){
            sum += elementos;
        }

        for (Elementos elementos: elements){
            System.out.print(elementos.getElement() + " ");
        }

    }
}
