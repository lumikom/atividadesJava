package Ex03;

public class ContaCorrente {
    Pessoa usuario;
    double limite, saldo, valorLimite;

    public Pessoa getUsuario() {
        return usuario;
    }

    public ContaCorrente(Pessoa usuario) {
        this.usuario = usuario;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }

     //public void sacar(double valor) {
    //if(valor > saldo || valor <= 0 || valor > valorLimite){
     //throw new ArithmeticException("Valor inválido");}
     //else{ saldo= saldo- valor;

     //}}
     public void sacar(double valor) throws Exception
    {valor = valor+ saldo;
        if(valor > saldo || valor <= 0 || valor > valorLimite){
            throw new Exception("Valor inválido!");
        }

    }
   

    public void depositar(double valor) {
       

    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;

    }

}
