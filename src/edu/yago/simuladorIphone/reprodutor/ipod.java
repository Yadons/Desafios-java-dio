package edu.yago.simuladorIphone.reprodutor;

public class ipod implements reprodutorMusical {
    @Override
    public boolean tocar() {
        return true;
    };

    @Override
    public boolean pausar() {
        return  false;
    };

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Não foi encontrada uma música de " + musica);
    }
}
