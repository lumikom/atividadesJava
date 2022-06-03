package APS_UII_N01_ROMULO_SOUZA;

public class Conta {
    protected double saldo;

    public void sacar(double valor) {

        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void atualiza(double taxa) {
        saldo = saldo * taxa;

    }

}
