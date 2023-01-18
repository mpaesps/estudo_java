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

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
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