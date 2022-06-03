package APS_UII_N01_ROMULO_SOUZA;

public class ContaCorrente extends Conta {
    @Override
    public void atualiza(double taxa) {
        super.atualiza(saldo=saldo+taxa*3);
    }

}
