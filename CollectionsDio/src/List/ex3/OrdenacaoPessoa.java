package List.ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoa(){
        this.listaDePessoas = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarIdade(){
        List<Pessoa> listaDeIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(listaDeIdade);
        return listaDeIdade;
    }
    public List<Pessoa> ordenarAltura(){
        List<Pessoa> listaDeAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(listaDeAltura, new CompareAltura());
        return listaDeAltura;
    }

    public static void main ( String[] args ) {
        OrdenacaoPessoa listaDePessoas = new OrdenacaoPessoa();

        listaDePessoas.adicionarPessoa("João", 20, 1.80);
        listaDePessoas.adicionarPessoa("Maria", 25, 1.70);
        listaDePessoas.adicionarPessoa("José", 30, 1.90);
        listaDePessoas.adicionarPessoa("Ana", 35, 1.60);
        listaDePessoas.adicionarPessoa("Pedro", 40, 1.75);

        System.out.println("Ordenação por idade:");
        for (Pessoa p : listaDePessoas.ordenarIdade()){
            System.out.println(p.getNome() + " - " + p.getIdade());
        }

        System.out.println("Ordenação por altura:");
        for (Pessoa p : listaDePessoas.ordenarAltura()){
            System.out.println(p.getNome() + " - " + p.getAltura());
        }
    }
}
