package edu.yago.javaCollections.list.operacoesBasicas.Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.exibirContato();

        agendaContato.adicionarContato("Yago", 78956156);
        agendaContato.adicionarContato("josé",65816556);
        agendaContato.adicionarContato("Camila", 5655664);

        agendaContato.exibirContato();
        agendaContato.removerContato("josé");
        agendaContato.exibirContato();
        System.out.println(agendaContato.pesquisarPorNome("Yago"));
    }
}
