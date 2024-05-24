package edu.yago.simuladorIphone.navegador;

public class safari implements navegadorInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página..." + url);
    }

    @Override
    public boolean adicionarNovaAba() {
        return true;
    }

    @Override
    public boolean atualizarPagina() {
        return true;
    }
}
