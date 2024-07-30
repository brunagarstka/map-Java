package evento;

import java.time.LocalDate;
import java.time.temporal.JulianFields;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao, data);
        eventosMap.put(data, new Evento(nome, atracao, data));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
       /*  Set<LocalDate> keySet = eventosMap.keySet(); //o keyset ta retornando todas em chaves em set
        Collection<Evento> values = eventosMap.values(); //ta me retornando um coleção com varios nome*/
        //eventosMap.get(); eu nao poderia utilizar pois nao sabe qual é a chave
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximoData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){   //pode ser utilizado no lugar de Map.Entry<LocalDate, Evento> // pode ser utilizado no lugar somente var
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximoData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + entry.getValue() + " acontera na data " + entry.getKey());
                break;
            }
        }
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7,29), "Evento 1", "atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 30), "Evento 2", "atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 31), "Evento 3", "atracao 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}   
