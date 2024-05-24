package edu.yago.servicoMensagemInstantanea.apps;

public class MSNmensseger extends servicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConexao(); // Para evitar que apareça no computador de maria o ideal é colocar em outro pacote e proteger com "protect".
        System.out.println("Enviando mensagem pelo MSN Mensseger.");
    };

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Mensseger.");
    };

    public void salvarHistorico() {
        System.out.println("Salvando histórico da mensagem MSN Mensseger.");
    }
}
