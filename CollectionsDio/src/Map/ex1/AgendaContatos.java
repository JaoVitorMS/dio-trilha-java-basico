package Map.ex1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos ( ) {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato (String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarNome(String nome){
        Integer numeroNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroNome = agendaContatoMap.get(nome);
        }
        return  numeroNome;
    }

    public static void main ( String[] args ) {
        AgendaContatos contatos = new AgendaContatos();
        contatos.adicionarContato("João", 123456789);
        contatos.adicionarContato("Maria", 987654321);
        contatos.adicionarContato("Pedro", 147258369);
        contatos.exibirContatos();

        System.out.println(contatos.pesquisarNome("Maria"));
        contatos.removerContato("Maria");
        contatos.exibirContatos();
    }
}
