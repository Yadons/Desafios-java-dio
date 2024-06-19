package edu.yago.javaCollections.list.operacoesBasicas.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.adicionarConvidado("convidado 1", 12345);
        conjuntoConvidados.adicionarConvidado("convidado 2", 123456);
        conjuntoConvidados.adicionarConvidado("convidado 3", 12345);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

    }
}
