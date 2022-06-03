package Ex03;

public class teste {
    public static void main(String[] args)  {
    PessoaFisica pf1 = new PessoaFisica();

    ContaCorrente cc1 = new ContaCorrente(pf1);
    cc1.setValorLimite(350);
    cc1.setSaldo(400);
    cc1.setLimite(700);
    cc1.sacar(350);
    System.out.println(cc1.getSaldo());

    }

}
