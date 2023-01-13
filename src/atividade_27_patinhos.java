import java.util.Scanner;

/*0. Programa em Java dos patinhos da Xuxa
Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:

n patinhos foram passear
Além das montanhas
Para brincar
A mamãe gritou: Quá, quá, quá, quáMas só n-1 patinhos voltaram de lá.


Que se repete até nenhum patinho voltar de lá.
Ao final, todos os patinhos voltam:

A mamãe patinha foi procurar
Além das montanhas
Na beira do mar
A mamãe gritou: Quá, quá, quá, quá
E os n patinhos voltaram de lá.

Crie um programa em Java que recebe um inteiro positivo
do usuário e exibe a música inteira na tela,
onde o inteiro recebido representa o número inicial n de patinhos que foram passear.*/
public class atividade_27_patinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pato = sc.nextInt();
        int patoInicial = pato;

        while (pato != 0){
            //System.out.println(pato);
            //pato --;
            System.out.format("\n%d  patinhos foram passear\nAlém das montanhas\nPara brincar\n", pato);
            System.out.format("A mamãe gritou: Quá, quá, quá, quá\nMas só %d patinhos voltaram de lá.", --pato);
        }
        System.out.format("\nA mamãe patinha foi procurar\nAlém das montanhas\nNa beira do mar\n" +
                "A mamãe gritou: Quá, quá, quá, quá\n" +
                "E os %d patinhos voltaram de lá.", patoInicial);
    }
}
