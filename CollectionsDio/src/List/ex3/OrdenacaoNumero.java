package List.ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero implements Comparable<Integer> {
    private List<Integer> numlist = new ArrayList<>();

    public OrdenacaoNumero ( ) {
        this.numlist = new ArrayList<>();
    }

    public List<Integer> getNumlist () {
        return numlist;
    }

    public void setNumlist ( List<Integer> numlist ) {
        this.numlist = numlist;
    }
    public void adicionarNumero ( Integer num ) {
        numlist.add(num);
    }
    @Override
    public int compareTo ( Integer i ) {
        return Integer.compare(this.numlist.getFirst(), i);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> ascendente = new ArrayList<>(numlist);
        Collections.sort(ascendente);
        return ascendente;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> descendente = new ArrayList<>(numlist);
        Collections.sort(descendente, Collections.reverseOrder());
        return descendente;
    }

//   public List<Integer> ordenarDescendente(){
//        List<Integer> descendente = new ArrayList<>(numlist);
//        Collections.sort(descendente);
//        return descendente;
//   }

    public static void main ( String[] args ) {
        OrdenacaoNumero listinha = new OrdenacaoNumero();
        listinha.adicionarNumero(132);
        listinha.adicionarNumero(276);
        listinha.adicionarNumero(347256);
        listinha.adicionarNumero(44627);
        listinha.adicionarNumero(5573);
        listinha.adicionarNumero(686);
        listinha.adicionarNumero(723);
        listinha.adicionarNumero(823);
        listinha.adicionarNumero(923);
        listinha.adicionarNumero(10);
        listinha.adicionarNumero(1123);
        listinha.adicionarNumero(12);
        listinha.adicionarNumero(13);
        listinha.adicionarNumero(11);

        System.out.println("Ordenação Ascendente: "+listinha.ordenarAscendente());
        System.out.println("Ordenação Descendente: "+listinha.ordenarDescendente());
    }
}
