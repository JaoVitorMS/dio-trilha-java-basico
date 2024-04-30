package List.ex1;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) { // Construtor para poder definir a descrição de cada tarefa
        this.descricao = descricao;
    }

    public String getDescricao () {
        return descricao;
    }
    public void setDescricao ( String descricao ) {
        this.descricao = descricao;
    }

    @Override
    public String toString () {
        return  descricao;
    }

}