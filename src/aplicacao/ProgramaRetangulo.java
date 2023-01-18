package aplicacao;

import entidades.Retangulo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("==RETANGULO==");
        System.out.println("digite a base: ");
        retangulo.largura = sc.nextDouble();
        System.out.println("digite a altura");
        retangulo.altura = sc.nextDouble();

        System.out.println(retangulo);
    }
}
