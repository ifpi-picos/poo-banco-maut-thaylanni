
public class ContaPoupanca extends Conta {
    private double taxaTransferencia;
    private double taxaSaque;
    private double rendimento;

    public ContaPoupanca(String agencia, String numeroConta, Cliente cliente, double rendimento) {
        super(agencia, numeroConta, cliente);
        this.taxaTransferencia = 0.10; 
        this.taxaSaque = 0.05; 
        this.rendimento = rendimento; 
    }

   
    public void transferencia(double valor, Conta destino) {
        double valorComTaxa = valor + (valor * taxaTransferencia);
        
        if (getSaldo() >= valorComTaxa) {
            transferencia(valorComTaxa, destino);
            System.out.println("Transferência realizada com sucesso. Taxa de transferência aplicada: " + (taxaTransferencia * 100) + "%");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    public void saque(double valor) {
        double valorComTaxa = valor + (valor * taxaSaque);

        if (getSaldo() >= valorComTaxa) {
            realizarSaque(valorComTaxa);
            System.out.println("Saque realizado com sucesso. Taxa de saque aplicada: " + (taxaSaque * 100) + "%");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    private void realizarSaque(double valorComTaxa) {
    }


   
    public void deposito(double valor) {
        double valorComRendimento = valor + (valor * rendimento);
        deposito(valorComRendimento);
        System.out.println("Depósito realizado com sucesso. Rendimento aplicado: " + (rendimento * 100) + "%");
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}


    
  





