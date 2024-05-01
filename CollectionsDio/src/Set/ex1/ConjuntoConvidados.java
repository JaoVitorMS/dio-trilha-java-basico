package Set.ex1;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados () {
        convidadosSet = new HashSet<Convidado>();
    }
    public void adicionarConvidado ( String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidado( int codigoConvite ) {
        convidadosSet.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }
    public void contarConvidados(){
        System.out.println("Total de convidados: " + convidadosSet.size());
    }
    public void exibirConvidados(){
        convidadosSet.forEach(convidado -> System.out.println(convidado));
    }

    public static void main ( String[] args ) {
        ConjuntoConvidados lista = new ConjuntoConvidados();
        lista.adicionarConvidado("João", 124242);
        lista.adicionarConvidado("Maria", 124243);
        lista.adicionarConvidado("José", 124244);
        lista.adicionarConvidado("Guido", 124245);
        lista.adicionarConvidado("Ana", 124246);
        lista.adicionarConvidado("Guido", 124247);

        lista.contarConvidados();
        lista.exibirConvidados();
        lista.removerConvidado(124247);
        lista.contarConvidados();
        lista.exibirConvidados();
    }
}
