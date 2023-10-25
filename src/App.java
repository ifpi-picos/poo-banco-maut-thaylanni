import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        boolean exec = true;
        List<Conta> contas = new ArrayList<>(); 
        Conta conta = null; 

        do {
            System.out.println("#### MENU BANCO MAUT ####");
            System.out.println("1) Cadastrar cliente");
            System.out.println("2) Sacar");
            System.out.println("3) Depositar");
            System.out.println("4) Transferir");
            System.out.println("5) Sair");

            int opt = prompt.nextInt();
            prompt.nextLine(); 

            switch (opt) {
                case 1:
                    System.out.println("Digite seu nome:");
                    String nome = prompt.nextLine();
                    System.out.println("Digite seu CPF:");
                    String cpf = prompt.nextLine();
                    System.out.println("Digite o dia do nascimento:");
                    int dia = prompt.nextInt();
                    System.out.println("Digite mês do nascimento:");
                    int mes = prompt.nextInt();
                    System.out.println("Digite o ano do nascimento:");
                    int ano = prompt.nextInt();
                    prompt.nextLine(); 
                    LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
                    Cliente cliente = new Cliente(nome, cpf, null, dataNascimento);

                    System.out.println("Deseja adicionar endereço (S/N)?");
                    String resp = prompt.nextLine();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("Digite o endereço:");
                        String endereco = prompt.nextLine();
                        cliente.setEndereco(endereco);
                    }

                    System.out.println("Escolha o tipo de conta (1 - Conta Corrente, 2 - Conta Poupança):");
                    int tipoConta = prompt.nextInt();
                    prompt.nextLine(); 

                    if (tipoConta == 1) {
                        conta = new ContaCorrente(nome, nome, cliente, dia);
                    } else if (tipoConta == 2) {
                        conta = new ContaPoupanca(nome, nome, cliente, dia);
                    }

                    contas.add(conta); 

                    break;

                case 2:
                    if (conta != null) {
                        System.out.println("Digite o valor que deseja sacar:");
                        double valorSaque = prompt.nextDouble();
                        prompt.nextLine(); 

                        if (valorSaque < conta.getSaldo()) {
                            conta.sacar(valorSaque);
                            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
                        } else if(valorSaque > conta.getSaldo()){
                            System.out.println("Saldo insuficiente ou valor de saque inválido.");
                        }
                    } else {
                        System.out.println("Nenhuma conta associada ao cliente. Crie uma conta primeiro.");
                    }
                    break;

                case 3:
                    if (conta != null) {
                        System.out.println("Digite o valor que deseja depositar:");
                        double valorDeposito = prompt.nextDouble();
                        prompt.nextLine(); 
                        if (valorDeposito > 0) {
                            conta.depositar(valorDeposito);
                            System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso.");
                        } else if(valorDeposito < 0){
                            System.out.println("Valor de depósito inválido.");
                        }
                    } else {
                        System.out.println("Nenhuma conta associada ao cliente. Crie uma conta primeiro.");
                    }
                    break;

                case 4:
                    if (conta != null) {
                        System.out.println("Digite o número da conta de destino:");
                        String numeroContaDestino = prompt.nextLine();

                        
                        Conta contaDestino = encontrarContaPorNumero(contas, numeroContaDestino);

                        if (contaDestino != null) {
                            System.out.println("Digite o valor que deseja transferir:");
                            double valorTransferencia = prompt.nextDouble();
                            prompt.nextLine();

                            if (valorTransferencia > 0) {
                                conta.transferir(contaDestino, valorTransferencia);
                                System.out.println("Transferência de R$" + valorTransferencia + " para a conta " + numeroContaDestino + " realizada com sucesso.");
                            } else if(valorTransferencia < 0 ) {
                                System.out.println("Transferência não pôde ser concluída. Verifique o valor ou saldo disponível.");
                            }
                        } else {
                            System.out.println("Conta de destino não encontrada. Verifique o número da conta.");
                        }
                    } else {
                        System.out.println("Nenhuma conta associada ao cliente. Crie uma conta primeiro.");
                    }
                    break;

                case 5:
                    exec = false;
                    break;
            }
        } while (exec);
    }

    public static Conta encontrarContaPorNumero(List<Conta> contas, String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }
}

   



