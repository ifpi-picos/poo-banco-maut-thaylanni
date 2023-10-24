
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transacao {
    private String descricao;
    private double valor;
    private Date data;

    private static List<Transacao> historicoTransacoes = new ArrayList<>();

    public Transacao(double valor, String descricao) {
        this.valor = valor;
        this.data = new Date(); 
        this.descricao = descricao;
        
        
        historicoTransacoes.add(this);
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public static List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }
}
