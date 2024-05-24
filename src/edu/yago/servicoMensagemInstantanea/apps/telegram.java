package edu.yago.servicoMensagemInstantanea.apps;

public class telegram extends servicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo telegram.");
    };

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram.");
    };
    public void salvarHistorico() {
        System.out.println("Salvando histórico da mensagem telegram.");
    };
}
