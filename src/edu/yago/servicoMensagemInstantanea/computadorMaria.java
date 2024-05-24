package edu.yago.servicoMensagemInstantanea;

import edu.yago.servicoMensagemInstantanea.apps.MSNmensseger;
import edu.yago.servicoMensagemInstantanea.apps.facebookMensagem;
import edu.yago.servicoMensagemInstantanea.apps.servicoMensagemInstantanea;
import edu.yago.servicoMensagemInstantanea.apps.telegram;

public class computadorMaria {
    public static void main(String[] args) {
        servicoMensagemInstantanea smi = null;
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            smi = new MSNmensseger();
        } else if (appEscolhido.equals("fcb")) {
            facebookMensagem fcb = new facebookMensagem();
        } else if (appEscolhido.equals("teleg")) {
            telegram teleg = new telegram();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
