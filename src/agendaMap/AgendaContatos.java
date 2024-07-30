package agendaMap;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos{
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
      agendaContatosMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(agendaContatosMap.isEmpty()){
            agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("nome5", 234561);
        agendaContatos.adicionarContato("nome1", 0);
        agendaContatos.adicionarContato("nome1 joarez", 345612);
        agendaContatos.adicionarContato("nome1 042", 456123);
        agendaContatos.adicionarContato("JUJUba1", 561234);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("nome5"));
    }
}


