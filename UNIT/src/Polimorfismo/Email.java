package Polimorfismo;

public class Email extends Documento{
	String enderecoEmail;
	public String getEnderecoEmail() {
		return enderecoEmail;
	}
	public void setEnderecoEmail(String enderecoEmail) {
		this.enderecoEmail = enderecoEmail;
	}
	public String getServidorEmail() {
		return servidorEmail;
	}
	public void setServidorEmail(String servidorEmail) {
		this.servidorEmail = servidorEmail;
	}
	String servidorEmail;
	@Override
	public String Imprimir() {
		return "Imprimindo e-mail";
	}
	public String Enviar() {
		return "Enviando e-mail";
	}

}
