
/*Fazer um programa para ler dois números inteiros M e N,e depois ler
        uma matriz de M linhas por N colunas contendo números inteiros,
        podendo haver repetições.Em seguida,ler um número inteiro X que
        pertence à matriz.Para cada ocorrência de X,mostrar os valores à
        esquerda,acima,à direita e abaixo de X,quando houver,conforme
        exemplo*/

import java.util.Scanner;

public class atividade_46_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j > 0) {
                    System.out.println("esquerda: " + matriz[i][j - 1]);
                }
                if (i > 0) {
                    System.out.println("cima: " + matriz[i - 1][j]);
                }
                if (j < matriz[i].length - 1) {
                    System.out.println("direita: " + matriz[i][j + 1]);
                }
                if (i < matriz.length - 1) {
                    System.out.println("baixo: " + matriz[i + 1][j]);
                }
            }
        }sc.close();
    }
}


