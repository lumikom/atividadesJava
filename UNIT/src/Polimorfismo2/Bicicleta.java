package Polimorfismo2;

public class Bicicleta {
	protected int marcha;

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	protected double velocidade;

	public String exibirDados() {
		return "Marcha: " + this.marcha + "Velocidade: " + this.velocidade;

	}
}
