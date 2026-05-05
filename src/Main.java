public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Banco DIO");

        Cliente maria = banco.cadastrarCliente("Maria", "084.749.158-18", "47 98846-8742");
        maria.imprimirDados();

        Conta cc = new ContaCorrente();
        cc.setCliente(maria);
        cc.depositar(500);
        cc.sacar(100);

        Conta cp = new ContaPoupanca();
        cp.setCliente(maria);
        cc.transferir(100, cp);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.listarClientes();
    }
}