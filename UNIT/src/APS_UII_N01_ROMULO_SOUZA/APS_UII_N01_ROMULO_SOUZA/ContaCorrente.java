package APS_UII_N01_ROMULO_SOUZA;

public class ContaCorrente extends Conta {
    @Override
    public void atualiza(double taxa) {
        saldo = saldo * (taxa * 2);
    }

}
