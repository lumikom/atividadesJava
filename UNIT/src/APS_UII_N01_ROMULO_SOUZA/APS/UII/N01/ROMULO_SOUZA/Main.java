package APS_UII_N01_ROMULO_SOUZA;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        cc1.depositar(68);
        cc1.sacar(67);
        System.out.println(cc1.saldo);
        cc1.atualiza(0.1);
        System.out.println(cc1.saldo);



        cp1.depositar(50);
        cp1.sacar(45);
        System.out.println(cp1.saldo);
        cp1.atualiza(0.3);
        System.out.println(cp1.saldo);

      
    
}
}