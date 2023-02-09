//Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;
import java.util.List;

public class atividade_44_arraylist2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vermelho");
        list.add("Roxo");
        list.add("Preto");
        list.add("Branco");

        System.out.println(list);

        String pos2 = list.get(2);

        System.out.println("pos 2 = " + pos2);

    }
}
