package evento;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private String atracao;
    private LocalDate data;
    public Evento(String nome, String atracao, LocalDate data) {
        this.nome = nome;
        this.atracao = atracao;
        this.data = data;
    }
    public String getNome() {
        return nome;
    }
    public String getAtracao() {
        return atracao;
    }
    public LocalDate getData() {
        return data;
    }
    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", atracao=" + atracao + ", data=" + data + "]";
    }
    
}
