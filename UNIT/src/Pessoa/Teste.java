package Pessoa;

public class Teste {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Pedro", "213", 112);
        PessoaJuridica pj1 = new PessoaJuridica("Pedro", "2134123", "2134", "Salão de Beleza","Saúde");

    System.out.println(pf1.Imprimir());
System.out.println(pj1.Imprimir());
}}
