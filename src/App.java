public class App {
    public static void main(String[] args) {
        Cliente c = new Cliente(null, null, null, null);
        Conta cc = new ContaCorrente("123", "321", c, 100);
        Conta cc2 = new ContaCorrente("123", "321", c, 100);
        Conta cp = new ContaPoupanca("321", "321", c, 0.1);

        cc.depositar(100);
        System.out.println(cc.getSaldo());
        cc.sacar(50);
        System.out.println(cc.getSaldo());
        cc.transferir(cc2, 10);
        cc.transferir(cc2, 10);
        cc.transferir(cc2, 10);
        cc.transferir(cc2, 10);
        cc.transferir(cc2, 10);
        cc.transferir(cc2, 10);
        System.out.println(cc.getSaldo());


        cp.depositar(100); // faltou adicionar os rendimentos
        System.out.println(cp.getSaldo());
        cp.sacar(10); // faltou cobrar a taxa

        System.out.println(cp.getSaldo());
    }
}


