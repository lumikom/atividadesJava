package Polimorfismo;

public class Carta extends Documento {
	private String endereco;
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFormaEnvio() {
		return formaEnvio;
	}

	public void setFormaEnvio(String formaEnvio) {
		this.formaEnvio = formaEnvio;
	}

	private String formaEnvio;
	@Override
	public String Imprimir() {
		return "Imprimindo Carta";
	}
	
	public String Anexar () {
		return"Carta Anexada";
	}
	}


