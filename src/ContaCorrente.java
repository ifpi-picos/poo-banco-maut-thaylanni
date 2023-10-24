
class ContaCorrente extends Conta {
    private double chequeEspecial;
    private int transferenciasRealizadas;

    public ContaCorrente(String agencia, String numeroConta, Cliente cliente, double chequeEspecial) {
        super(agencia, numeroConta, cliente);
        this.chequeEspecial = chequeEspecial;
        this.transferenciasRealizadas = 0;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public int getTransferenciasRealizadas() {
        return transferenciasRealizadas;
    }

    public void incrementarTransferencia() {
        transferenciasRealizadas++;
    }
}
