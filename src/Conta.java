import java.time.LocalDate;
import java.util.List;

public abstract class Conta {
    private String numeroConta, numeroAgencia;
    private double saldo;
    private Cliente cliente;

    public Conta (String numeroConta, String numeroAgencia, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            notificarOperacao("Saque de R$" + valor);
            return true;
        }
        notificarOperacao("Tentativa de saque de R$" + valor + " sem saldo suficiente.");
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            notificarOperacao("Depósito de R$" + valor);
            return true;
        }
        notificarOperacao("Tentativa de depósito de valor inválido: R$" + valor);
        return false;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
 
    public boolean transferir(Conta contaDestino, double valor) {
        if (valor > 0 && saldo >= valor) {
            if (contaDestino.depositar(valor)) {
                saldo -= valor;
                notificarOperacao("Transferência de R$" + valor + " para conta " + contaDestino.getNumeroConta());
                return true;
            }
        }
        notificarOperacao("Tentativa de transferência de R$" + valor + " para conta " + contaDestino.getNumeroConta() + " não pôde ser concluída.");
        return false;
    }

    private void notificarOperacao(String mensagem) {
       
        System.out.println(mensagem);
    }

    public Conta encontrarContaPorNumero(List<Conta> contas, String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }
}






   