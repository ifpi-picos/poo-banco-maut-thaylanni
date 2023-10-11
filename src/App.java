import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        do{

            System.out.println("#### MENU BANCO MAUT ####");
            System.out.println("1)Cadastrar cliente");
            System.out.println("2)Sacar");
            System.out.println("3)Depositar");
            System.out.println("4)Transferir");
            System.out.println("5)Sair");

            int opt = prompt.nextInt();

            switch(opt){
                case 1: 
                    Cliente cliente;

                System.out.println("Digite seu nome:");
                String nome = prompt.nextLine();
                System.out.println("Digite seu CPF:");
                String cpf = prompt.nextLine();
                System.out.println("Digite o dia do nascimento:");
                int dia = prompt.nextInt();
                System.out.println("Digite mes do nascimento: ");
                int mes = prompt.nextInt();
                System.out.println("Digite o ano do nascimento:");
                int ano = prompt.nextInt();
    
                System.out.println("Deseja adicionar endereco(S/N)");
                String resp = prompt.nextLine();
                break;                                   
            }
        }while(exec);
    }
}
