
public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private int transferenciasRealizadas;

    public ContaCorrente(String agencia, String numeroConta, Cliente cliente,
            double chequeEspecial) {
        super(agencia, numeroConta, cliente);
        this.chequeEspecial = chequeEspecial;
        this.transferenciasRealizadas = 0;
    }

    // faltou sobrescrever o método de saque para usar o cheque especial

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public int getTransferenciasRealizadas() {
        return transferenciasRealizadas;
    }

    public void incrementarTransferencia() {
        transferenciasRealizadas++;
    }


    public void transferencia(double valor, Conta destino) {
        if (transferenciasRealizadas < 2) {
            super.transferir(destino, valor);
        } else {
            double valorComTaxa = valor + (valor * 0.10);
            if (getSaldo() + chequeEspecial >= valorComTaxa) {
                super.transferir(destino, valorComTaxa);
                System.out.println(
                        "Transferência realizada com sucesso. Taxa de transferência aplicada: 10%");
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        }
        incrementarTransferencia();
    }
}

