package br.com.unit.me;

public class Proprietario extends Pessoa{

	private double valorInvestimento;
	
	public Proprietario(double valorInvestimento, String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		this.valorInvestimento = valorInvestimento;
	}
	
	public void displayProprietario() {
		System.out.println("----| Proprietário |----");
		System.out.println("Nome: " + super.getNome() + "\n" + 
						   "Idade: " + super.getIdade() + "\n" + 
						   "Sexo: " + super.getSexo() + "\n" +
						   "Valor Investido: " + this.getValorInvestimento());
	}

	public double getValorInvestimento() {
		return valorInvestimento;
	}

	public void setValorInvestimento(double valorInvestimento) {
		this.valorInvestimento = valorInvestimento;
	}
	
	
}
