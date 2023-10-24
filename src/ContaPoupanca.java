
class ContaPoupanca extends Conta {
    private double taxaTransferencia;
    private double taxaSaque;
    private double rendimento;

    public ContaPoupanca(String agencia, String numeroConta, Cliente cliente, double rendimento) {
        super(agencia, numeroConta, cliente);
        this.taxaTransferencia = 0.10;
        this.taxaSaque = 0.05;
        this.rendimento = rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
  
    
  





