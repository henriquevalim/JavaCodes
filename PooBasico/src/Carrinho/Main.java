package Carrinho;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("notebook",30.00, " notezao");
        Produto produto2 = new Produto("camiseta", 27.56, " tech t-shirt");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarAoCarrinho(produto1);
        carrinho.adicionarAoCarrinho(produto2);
        System.out.println("Produtos no carrinho");
        for (Produto produto : carrinho.produtosNoCarrinho);
        System.out.println(produto1.getNome() + "- R$ " + produto1.getValor() + produto1.getDescricao());
        System.out.println(produto2.getNome() + "- R$ " + produto2.getValor() + produto2.getDescricao());
        System.out.println("Valor total do carrinho: R$" + carrinho.getTotal());
    }
}