package aplicacao;

import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa  {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("entre com o tamanho do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("entre com o tamanho do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("triangulo X area: %.4f%n", areaX);
        System.out.printf("triangulo Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("maior area: X");
        }
        else {
            System.out.println("maior area: Y");
        }
        sc.close();
    }
}