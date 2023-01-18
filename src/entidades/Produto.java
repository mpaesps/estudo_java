package entidades;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double ValorTotalEstoque(){
        return preco * quantidade;
    }
    public void AdicionarProdutos(int quantidade){
        this.quantidade+=quantidade;
    }
    public void RemoverProdutos(int quantidade){
        this.quantidade-=quantidade;
    }
public String toString(){
        return nome
                +"\n$"
                +String.format("%.2f", preco)
                +"\n"
                +quantidade
                +" unidades\nTotal: $"
                +String.format("%.2f", ValorTotalEstoque());
}
}
