package APS_UII_N01_ROMULO_SOUZA;

public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxa) {
        saldo = saldo * (taxa * 2);
    }

    @Override
    public void depositar(double valor) {
        saldo = (saldo + valor) - 0.10;
    }
}
