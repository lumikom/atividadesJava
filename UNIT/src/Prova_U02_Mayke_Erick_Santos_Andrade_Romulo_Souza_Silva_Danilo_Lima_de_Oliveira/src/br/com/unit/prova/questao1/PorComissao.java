package br.com.unit.prova.questao1;

public class PorComissao extends Funcionario implements Comissao{

	private double vendas;
	
	public PorComissao(String nome) {
		super(nome);
		this.vendas = 0; 
	}
	
	public PorComissao() {
		super("");
		this.vendas = 0;
	}
	
	public PorComissao(String nome, double vendas) {
		super(nome);
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
		double valorPagamento = this.vendas * Comissao.TAXA_COMISSAO;
		return valorPagamento;
	}


}
