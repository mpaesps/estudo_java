/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”*/

import java.util.Locale;
import java.util.Scanner;

public class atividade_22_intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("digite um numero");
        float num = sc.nextFloat();

        if (num >= 0 & num <= 25){
            System.out.format("o numero %.2f esta no intervalo [0-25]", num);
        } else if (num >= 25 & num <= 50) {
            System.out.format("o numero %.2f esta no intervalo [25-50]", num);
        } else if (num >= 50 & num <= 75) {
            System.out.format("o numero %.2f esta no intervalo [50-75]", num);
        } else if (num >= 75 & num <= 100) {
            System.out.format("o numero %.2f esta no intervalo [75-100]", num);
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
