package aplicacao;

import entidades.Estudante;

import java.util.Scanner;

public class ProgramaEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Nome do aluno: ");
        estudante.aluno = sc.nextLine();
        System.out.println("Nota do primeiro trimestre: [30]");
        estudante.nota1 = sc.nextDouble();
        System.out.println("Nota do primeiro trimestre: [35]");
        estudante.nota2 = sc.nextDouble();
        System.out.println("Nota do primeiro trimestre: [35]");
        estudante.nota3 = sc.nextDouble();

        estudante.calcularMedia();

        if (estudante.media > 100 || estudante.media < 0) {
            System.out.println("alguma nota pode ter sido digitada errada");
        } else if (estudante.media > 60) {
            System.out.println("Nota final = " + estudante.media + "\nPASSOU");
        } else if (estudante.media < 60){
            estudante.falta();
            System.out.println("\"Nota final = " + estudante.media + "\nREPROVOU\nFalta " + estudante.falta() + " pontos");
        }
    }
}


