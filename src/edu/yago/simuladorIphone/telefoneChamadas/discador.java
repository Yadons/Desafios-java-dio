package edu.yago.simuladorIphone.telefoneChamadas;

public class discador implements AparelhoTelefonico{
    @Override
    public void ligar(String numero) {
       System.out.println("Ligando para... " + numero);
    }

    @Override
    public void atender()  {
      System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
