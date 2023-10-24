
import java.time.LocalDate;

public class Conta {
    private String numeroConta, numeroAgencia;
    private double saldo;
    private Cliente cliente;

    public Conta(String numeroConta, String numeroAgencia, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
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
                System.out.println("Transferência realizada com sucesso!");
                return true;
            }
        }
        System.out.println("Transferência não pôde ser concluída.");
        return false;
    }
}





   