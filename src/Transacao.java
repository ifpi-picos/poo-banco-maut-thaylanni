import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private String descricao;
    private double valor;
    private Date data;

 
    private static List<Transacao>historicoTransacoes = new ArrayList<>();

    public Transacao(double valor, String descricao) {
        this.valor = valor;
        this.data = new Date(0);
        this.descricao = descricao;
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
    
}
