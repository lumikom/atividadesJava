package Polimorfismo;

public class Telegrama extends Documento {
	private String quantCaracter;
	public String getQuantCaracter() {
		return quantCaracter;
	}
	public void setQuantCaracter(String quantCaracter) {
		this.quantCaracter = quantCaracter;
	}
	public double getValorTelegrama() {
		return valorTelegrama;
	}
	public void setValorTelegrama(double valorTelegrama) {
		this.valorTelegrama = valorTelegrama;
	}
	private double valorTelegrama;
	@Override
	public String Imprimir() {
		return "Imprimindo Telegrama";
	}
	public String Pagar() {
		return "Telegrama Pago";
	}

}
