package aplicacao;
import entidades.Produto;
import java.util.Scanner;

public class ProgramaEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("===PRODUTO===");
        System.out.println("nome: ");
        produto.nome = sc.nextLine();
        System.out.println("preço: ");
        produto.preco = sc.nextDouble();
        System.out.println("quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println("produto " + produto);

        System.out.println("quantidade de produtos para adicionar ao estoque");
        int quantidade = sc.nextInt();
        produto.AdicionarProdutos(quantidade);

        System.out.println("estoque atualizado: " + produto);

        System.out.println("quantidade de produtos para remover do estoque");
        quantidade = sc.nextInt();
        produto.RemoverProdutos(quantidade);

        System.out.println("estoque atualizado: " + produto);
    }
}
