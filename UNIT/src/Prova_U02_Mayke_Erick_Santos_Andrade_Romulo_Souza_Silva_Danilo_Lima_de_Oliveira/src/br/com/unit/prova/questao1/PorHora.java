package br.com.unit.prova.questao1;

public class PorHora extends Funcionario{

	protected double valorHora;
	protected int numHora;
	
	public PorHora() {
		super("");
		this.valorHora = 0;
		this.numHora = 0;
	}
	
	public PorHora(String nome) {
		super(nome);
	}
	
	public PorHora(String nome, double valorHora, int numHora) {
		super(nome);
		this.valorHora = valorHora;
		this.numHora = numHora;
	}

	@Override
	public double getPagamento() {
		double valorPagamento = this.valorHora * this.numHora;
		return valorPagamento;
	}

}
