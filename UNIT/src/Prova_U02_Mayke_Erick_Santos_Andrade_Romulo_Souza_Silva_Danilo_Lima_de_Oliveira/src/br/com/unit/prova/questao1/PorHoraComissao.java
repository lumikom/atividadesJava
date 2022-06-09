package br.com.unit.prova.questao1;

public class PorHoraComissao extends PorHora implements Comissao{

	private double vendas;
	
	public PorHoraComissao() {
		super("", 0, 0);
		this.vendas = 0;
	}
	
	public PorHoraComissao(String nome, double valorHora, int numHora) {
		super(nome, valorHora, numHora);
		this.vendas = 0;
	}
	
	public PorHoraComissao(String nome, double valorHora, int numHora, double vendas) {
		super(nome, valorHora, numHora);
		this.vendas = vendas;
	}
	
	@Override
	public void setVendas(double vendas) {
		try {
			if(vendas > 0) {
				this.vendas = vendas;
			}
			else {
				throw new VendasNegativoException();
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Override
	public double getPagamento() {
		return super.getPagamento() + (this.vendas * Comissao.TAXA_COMISSAO);
	}

}
