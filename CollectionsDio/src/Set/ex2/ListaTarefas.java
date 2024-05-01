package Set.ex2;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas ( ) {
        this.listaTarefas = new HashSet<Tarefa>();
    }
    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao, false);
        listaTarefas.add(tarefa);
    }
    public void removerTarefa(String descricao){
        listaTarefas.remove(descricao);
    }
    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }
    public int contarTarefas(){
        return listaTarefas.size();
    }
    public void obterTarefasFeitas(){
        for (Tarefa t : listaTarefas){
            if (t.isFinalizada()){
                System.out.println(t.getDescricao());
            }
        }
    }
    public void obterTarefasPendentes(){
        for (Tarefa t : listaTarefas){
            if (!t.isFinalizada()){
                System.out.println(t.getDescricao());
            }
        }
    }
    public void marcarTarefaComoFeita(String descricao){
        for (Tarefa t : listaTarefas){
            if (t.getDescricao().equals(descricao)){
                t.setFinalizada(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : listaTarefas){
            if (t.getDescricao().equals(descricao)){
                t.setFinalizada(false);
            }
        }
    }
    public void limparListaTarefa(){
        listaTarefas.removeAll(listaTarefas);
    }

    public static void main ( String[] args ) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Estudar Python");
        lista.adicionarTarefa("Estudar C++");
        lista.adicionarTarefa("Estudar C#");
        lista.adicionarTarefa("Estudar Ruby");

        System.out.println("--- Lista de Tarefas ---");
        lista.exibirTarefas();
        System.out.println("--- Contar Tarefas ---");
        System.out.println(lista.contarTarefas());
        System.out.println("--- Tarefas Feitas ---");
        lista.obterTarefasFeitas();
        System.out.println("--- Tarefas Pendentes ---");
        lista.obterTarefasPendentes();
        System.out.println("--- Marcar Tarefa Como Feita ---");
        lista.marcarTarefaComoFeita("Estudar Java");
        lista.obterTarefasFeitas();
        System.out.println("--- Marcar Tarefa Como Pendente ---");
        lista.marcarTarefaPendente("Estudar Python");
        lista.obterTarefasPendentes();
    }
}
