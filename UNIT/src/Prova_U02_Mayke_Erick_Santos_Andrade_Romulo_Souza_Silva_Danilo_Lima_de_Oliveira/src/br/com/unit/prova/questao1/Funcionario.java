package br.com.unit.prova.questao1;

public abstract class Funcionario {

	private String nome;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public void imprimirPagamento() {
		System.out.println(this.nome + " ganha R$ " + getPagamento());
	}
	
	public abstract double getPagamento();
}
