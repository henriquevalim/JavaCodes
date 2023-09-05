package Carrinho;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {
    double valorTotal = 0.0;
    List<Produto> produtosNoCarrinho;

    public double getTotal(){
        return valorTotal;
    }
    public CarrinhoDeCompras(){
        produtosNoCarrinho = new ArrayList<>();
    }
    public void adicionarAoCarrinho(Produto produto){
        produtosNoCarrinho.add(produto);
        valorTotal += produto.getValor();
    }
}
