package edu.yago.javaCollections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class listaTarefa {
    //atributo
    private  List<tarefa> tarefaList;

    public listaTarefa() {
        this.tarefaList = new ArrayList<>();
    };

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new tarefa(descricao));
    };

    public void removerTarefa(String descricao){
        List<tarefa>tarefasParaRemover = new ArrayList<>();
        for (tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
               tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    };

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    };

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    //atalho do main é: psvm.
    // crtl + d - duplica a linha, para descer o conteúdo basta usar o shift + crtl + seta, para comentar um trcho do código se utiliza crtl + /.
    public static void main(String[] args) {
        listaTarefa listaTarefa = new listaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
