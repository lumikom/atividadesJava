package APS_UII_N01_ROMULO_SOUZA;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        cc1.depositar(68);
        cc1.sacar(67);
        System.out.println(cc1.saldo);
        cc1.atualiza(0.1);
        cc1.saldo;

    
}
}