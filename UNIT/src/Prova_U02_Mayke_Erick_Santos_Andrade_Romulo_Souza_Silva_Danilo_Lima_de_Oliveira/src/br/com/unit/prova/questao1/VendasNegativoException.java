package br.com.unit.prova.questao1;

public class VendasNegativoException extends Exception{

	@Override
	public String getMessage() {
		System.out.println("O valor das vendas est� negativo!");
		return super.getMessage();
	}
}
