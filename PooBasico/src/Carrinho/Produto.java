package Carrinho;

public class Produto {
    String nome;
    double valor;
    String descricao;

    public Produto(String nome, double valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}
