package Set.ex2;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos ( ) {
        this.contatos = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatos);
    }
    public void pesquisarNome (String nome){
        for (Contato c: contatos){
            if (c.getNome().equals(nome)){
                System.out.println(c);
            }
        }
    }
    public Contato atualizarContato (String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatos){
            if (c.getNome().equals(nome)){
                c.setNumero(novoNumero);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main ( String[] args ) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("José", 456789123);
        agenda.exibirContato();
        System.out.println("---------------");
        agenda.pesquisarNome("Maria");
        System.out.println("---------------");
        agenda.atualizarContato("Maria", 123456789);
        System.out.println("---------------");
        agenda.exibirContato();
    }
}
