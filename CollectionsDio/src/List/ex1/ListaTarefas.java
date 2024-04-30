package List.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private final List<Tarefa>  listadetarefas;

    public ListaTarefas ( ) { // Construtor para poder definir a lista de tarefas
        this.listadetarefas = new ArrayList<Tarefa>(); // Inicializa a lista de tarefas
    }
    public void adicionarTarefa ( String descricao ) { // Metodo para adicionar novos itens na lista
        listadetarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){ // Metodo para remover itens na lista
        List<Tarefa> removerTarefas = new ArrayList<>(); // criação de uma nova lista para conter os itens a ser removido
        for (Tarefa t  : listadetarefas){ //for each
            if(t.getDescricao().equalsIgnoreCase(descricao)){removerTarefas.add(t);} //if para caso a descrição seja compativel com algum item, o mesmo
            //seja removido
        }
        listadetarefas.removeAll(removerTarefas);
    }
    public int obterNumeroTotalTarefas(){
        return  listadetarefas.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(listadetarefas);
    }

    public static void main ( String[] args ) {
        ListaTarefas listinha = new ListaTarefas();

        System.out.println(listinha.obterNumeroTotalTarefas());
        listinha.adicionarTarefa("Maça");
        listinha.adicionarTarefa("Laranja");
        listinha.adicionarTarefa("Jaca");
        listinha.adicionarTarefa("Morango");
        listinha.adicionarTarefa("Kiwi");
        System.out.println(listinha.obterNumeroTotalTarefas());
        listinha.obterDescricoesTarefas();
        listinha.removerTarefa("Jaca");
        System.out.println(listinha.obterNumeroTotalTarefas());
        listinha.obterNumeroTotalTarefas();
        listinha.obterDescricoesTarefas();
    }
}