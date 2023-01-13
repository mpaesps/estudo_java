/*1. Programa em Java que mostra os números ímpares
Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 100.*/
public class atividade_28_numeros_impares {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 100){
            if (contador % 2 != 0 )
            System.out.println(contador);
            contador ++;
        }
    }
}
