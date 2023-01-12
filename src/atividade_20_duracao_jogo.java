//Leia a hora inicial e a hora final de  um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas

import java.util.Scanner;

public class atividade_20_duracao_jogo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int duracao;

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        }else{
            duracao = 24 - horaInicio + horaFim;
        }
        System.out.println("o jogo durou " + duracao + " horas");

        sc.close();
    }
}
