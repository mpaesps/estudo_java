import java.util.Scanner;

/*3. Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço while, pede ao usuário para que entre com as notas de
 todos os alunos da sala, um por vez.
.*/
public class atividade_30_media_turma {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero de aluno na sala");
    int alunoSala = sc.nextInt();
    int cont = 0;
    int media = 0;
    int notaAluno = 0;

    while (cont < alunoSala){
        System.out.println("digite a nota do aluno ");
            notaAluno = sc.nextInt();
        media = media + notaAluno;

            cont++;
        }
    media = media / alunoSala;
        System.out.format("A media da turma é %d", media);
    }
}
