package edu.yago.servicoMensagemInstantanea.apps;

public abstract class servicoMensagemInstantanea {

         public abstract void enviarMensagem();
         public abstract void receberMensagem();
        public abstract void salvarHistorico();

         protected void validarConexao(){
             System.out.println("Validando se está conectado.");
         };
}
