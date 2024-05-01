package Set.ex3;

import java.util.Comparator;

public class Alunos implements Comparable<Alunos> {
    private String nome;
    private long matricula;
    private double media;

    public Alunos ( String nome, long matricula, double media ) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public long getMatricula () {
        return matricula;
    }

    public void setMatricula ( long matricula ) {
        this.matricula = matricula;
    }

    public double getMedia () {
        return media;
    }

    public void setMedia ( double media ) {
        this.media = media;
    }

    @Override
    public int compareTo ( Alunos a ) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}
class ComparatorNota implements Comparator<Alunos>{

    @Override
    public int compare ( Alunos n1, Alunos n2 ) {
        return Double.compare(n1.getMedia(), n2.getMedia());
    }
}