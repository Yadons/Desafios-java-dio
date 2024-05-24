package edu.yago.simuladorIphone;

import edu.yago.simuladorIphone.telefoneChamadas.AparelhoTelefonico;
import edu.yago.simuladorIphone.telefoneChamadas.discador;
import edu.yago.simuladorIphone.navegador.navegadorInternet;
import edu.yago.simuladorIphone.navegador.safari;
import edu.yago.simuladorIphone.reprodutor.reprodutorMusical;
import edu.yago.simuladorIphone.reprodutor.ipod;
import edu.yago.simuladorIphone.smartphone.iphone;

public class equipamento {
    public static void main(String[] args) {
        AparelhoTelefonico aparelho = new discador();
        navegadorInternet navegador = new safari();
        reprodutorMusical reprodutor = new ipod();

        // Trabalhando as funções com o iphone
        AparelhoTelefonico apaIphone = new iphone();
        navegadorInternet naveIphone = new iphone();
        reprodutorMusical funcIphone = new iphone();

        //TESTE discador
        aparelho.ligar("789-982-22");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        // TESTE discador no iphone
        apaIphone.ligar("7984-9255-10");
        apaIphone.atender();
        apaIphone.iniciarCorreioVoz();

        // Teste navegador
        navegador.adicionarNovaAba();
        navegador.exibirPagina("www.adicionarurl.com");
        navegador.atualizarPagina();
        // TESTE navegador no iphone
        naveIphone.adicionarNovaAba();
        naveIphone.exibirPagina("www.testeiphone.com");
        naveIphone.atualizarPagina();

        //TESTE reprodutor
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Aviões do forró");
        //TESTE reprodutor no iphone
        funcIphone.tocar();
        funcIphone.pausar();
        funcIphone.selecionarMusica("Jungle, Guns N' Roses");


    }
}
