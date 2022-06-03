package APS_UII_N01_ROMULO_SOUZA;

public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*3);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor-0.1);;
    }
}
