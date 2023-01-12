import java.util.Locale;
import java.util.Scanner;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação*/
public class atividade_23_plano_cartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.ENGLISH);

        System.out.println("digite o valor de x");
        float x = sc.nextFloat();
        System.out.println("digite o valor de y");
        float y = sc.nextFloat();

        if (x == 0 & y ==0){
            System.out.println("o valor esta  na origem");
        } else if (y == 0) {
            System.out.println("o valor esta  sobre eixo y");
        } else if (x == 0 ) {
            System.out.println("o valor esta  sobre eixo x");
        } else if (x > 0 & y > 0){
            System.out.println("o valor esta  no quadrante 1");
        } else if (x < 0 & y > 0) {
            System.out.println("o valor esta  no quadrante 2");
        } else if (x < 0 & y < 0) {
            System.out.println("o valor esta  no quadrante 3");
        } else if (x > 0 & y < 0) {
            System.out.println("o valor esta  no quadrante 4");
        }
    }
}
