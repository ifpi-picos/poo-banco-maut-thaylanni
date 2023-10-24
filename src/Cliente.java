
import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String cpf;      
    private String endereco;
    private LocalDate dataNascimento;
    private Conta conta;
    

  public Cliente(String nome, String cpf, String endereco, LocalDate dataNascimento){
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.dataNascimento = dataNascimento;
}
    public String getNome(){
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }


}

