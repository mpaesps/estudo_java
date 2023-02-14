import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Create an ArrayList of Integers and add 10 elements to it. Then, find the sum of all the elements in the list.
public class Atividade_47_ArrayListSomarElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> elements = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
          elements.add(sc.nextInt());
        }

        int sum = 0;
        for (int element: elements){
            sum += element;
        }
        System.out.println(elements);
        System.out.println("A soma dos 10 elementos: " + sum);

    }
}
