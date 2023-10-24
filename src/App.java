
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void app (String[] args) {
        Scanner prompt = new Scanner(System.in);
        boolean exec = true;

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


                    break;

                case 5:
                    exec = false;
                    break;
            }
        } while (exec);
    }
}

