package edu.yago.servicoMensagemInstantanea.apps;

public class facebookMensagem extends servicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Facebook.");
    };

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook.");
    };
    public void salvarHistorico() {
        System.out.println("Salvando histórico da mensagem facebook.");
    };
}
