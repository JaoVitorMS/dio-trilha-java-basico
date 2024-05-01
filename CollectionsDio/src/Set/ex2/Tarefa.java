package Set.ex2;

public class Tarefa {
    private String descricao;
    private boolean finalizada;

    public Tarefa ( String descricao, boolean finalizada ) {
        this.descricao = descricao;
        this.finalizada = finalizada;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao ( String descricao ) {
        this.descricao = descricao;
    }

    public boolean isFinalizada () {
        return finalizada;
    }

    public void setFinalizada ( boolean finalizada ) {
        this.finalizada = finalizada;
    }
}
