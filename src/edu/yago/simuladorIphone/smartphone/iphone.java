package edu.yago.simuladorIphone.smartphone;

import edu.yago.simuladorIphone.telefoneChamadas.AparelhoTelefonico;
import edu.yago.simuladorIphone.navegador.navegadorInternet;
import edu.yago.simuladorIphone.reprodutor.reprodutorMusical;

public class iphone implements AparelhoTelefonico, navegadorInternet, reprodutorMusical {

    public void ligar(String numero) {
        System.out.println("Ligando no iphone para " + numero );
    }

    public void atender() {
       System.out.println("atendendo no iphone...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iphone...");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina no iphone..." + url);
    }

    public boolean adicionarNovaAba() {
        return false;
    }

    public boolean atualizarPagina() {
        return false;
    }

    public boolean tocar() {
        return true;
    }

    public boolean pausar() {
        return true;
    }

    public void selecionarMusica(String musica) {
        System.out.println("A musica selecionada no iphone foi " + musica);
    }
}
