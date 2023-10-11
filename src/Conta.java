import java.time.LocalDate;
import java.util.Scanner;

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
        if (valor <= 0 || valor > saldo) {
            return false; 
        } else {
            saldo -= valor; 
            return true; 
        }
    }
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor; 
            return true; 
        } else {
            return false; 
        }
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

    public void transferir(Conta contaOrigem,Conta contaDestino,double valor) {
        if(contaOrigem.getSaldo()>0 && contaDestino.getSaldo() >valor){
            contaDestino.depositar(valor);
            System.out.println("Saque realizado com sucesso !!");
            
        }
    }
}





   