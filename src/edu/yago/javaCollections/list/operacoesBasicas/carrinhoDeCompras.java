package edu.yago.javaCollections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class carrinhoDeCompras {
    private List<item>  itemList;

    public carrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    };

    public void adicionarItem(String nome, double preco, int quantidade ) {
        itemList.add(new item(nome, preco, quantidade));
    };

    public void removerItem(String nome) {
        List<item> itemParaRemover= new ArrayList<>();
        for(item i : itemList ) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    };

    public int calcularValorTotal(){
      return itemList.size();
    };

    public void exibirItem() {
        System.out.println("Os itens que constam no carrinho são: " + itemList);
    }

    public static void main(String[] args) {
        carrinhoDeCompras carrinhoDeCompras = new carrinhoDeCompras();
        System.out.println("O total de itens é de: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("celular",1000, 1);
        carrinhoDeCompras.adicionarItem("capinha",20, 2);
        carrinhoDeCompras.adicionarItem("película",15, 2);
        System.out.println("O total de itens é de: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("capinha");
        System.out.println("O total de itens é de: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItem();
    }

}
