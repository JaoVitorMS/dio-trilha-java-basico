package Map.ex3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos () {this.eventosMap =new HashMap<>();}

    public void adicionarEvento( LocalDate data, String nome, String atracao ) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            System.out.println("Data: " + entry.getKey() + " - " + entry.getValue());
        }

    }

    public static void main ( String[] args ) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2021, 10, 10), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 11), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 12), "Evento 3", "Atração 3");

        agenda.exibirAgenda();

    }
}
