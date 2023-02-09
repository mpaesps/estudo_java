/*Write a Java program to insert an element into the array list at the first position.*/

import java.util.ArrayList;
import java.util.List;

public class atividade_43_arraylist1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Catarina");
        nomes.add("Pietra");
        nomes.add("Renata");

        System.out.println(nomes);

        nomes.add(0, "Laura");

        System.out.println(nomes);

    }

}
