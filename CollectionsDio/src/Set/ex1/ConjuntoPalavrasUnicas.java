package Set.ex1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> Conjunto;

    public ConjuntoPalavrasUnicas (  ) {
        this.Conjunto = new HashSet<>();
    }

    public Set<String> getConjunto () {
        return Conjunto;
    }

    public void setConjunto ( Set<String> conjunto ) {
        this.Conjunto = conjunto;
    }
    public void adicionarPalavra (String palavra ) {
        Conjunto.add(palavra);
    }
    public void removerPalavra(String palavra){
        Conjunto.remove(palavra);
    }
    public boolean verificarPalavra (String palavra){
        if(Conjunto.contains(palavra)){}
        return true;
    }
    public void exibirPalavraUnicas(){
        Conjunto.forEach(String -> System.out.println(String));
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(Conjunto, that.Conjunto);
    }

    @Override
    public int hashCode () {
        return Objects.hashCode(Conjunto);
    }

    public static void main ( String[] args ) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("João");
        conjunto.adicionarPalavra("Maria");
        conjunto.adicionarPalavra("José");
        conjunto.adicionarPalavra("Guido");
        conjunto.adicionarPalavra("Ana");
        conjunto.adicionarPalavra("Guido");
        conjunto.adicionarPalavra("Guido");

        conjunto.exibirPalavraUnicas();
        System.out.println("--------------------");
        conjunto.removerPalavra("Guido");
        System.out.println("--------------------");
        conjunto.exibirPalavraUnicas();
    }
}
