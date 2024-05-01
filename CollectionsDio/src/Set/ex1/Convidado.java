package Set.ex1;

import java.util.Objects;

public class Convidado {
    private int codigoConvite;
    private String nome;

    public Convidado ( String nome, int codigoConvite ) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    @Override
    public String toString () {
        return
                "codigoConvite = " + codigoConvite +
                ", nome = " + nome;

    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode () {
        return Objects.hashCode(codigoConvite);
    }

    public int getCodigoConvite () {
        return codigoConvite;
    }

    public void setCodigoConvite ( int codigoConvite ) {
        this.codigoConvite = codigoConvite;
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }
}
