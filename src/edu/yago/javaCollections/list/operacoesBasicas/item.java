package edu.yago.javaCollections.list.operacoesBasicas;

public class item {
    private String nome;
    private double preco;
    private int quantidade;

    public item(String descricao, double preco, int quantidade) {
        this.nome = descricao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public item(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public item(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
