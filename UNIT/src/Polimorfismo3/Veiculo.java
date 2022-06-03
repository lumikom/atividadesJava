package Polimorfismo3;

public class Veiculo {
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public double getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	protected String modelo;
	protected double velocidade;
	protected int passageiros;
	protected double combustivel;
	
	public void acelera() {
		System.out.println("Acelerando");
		
	
		
	}
	public void freia() {
		System.out.println("Freiando");
	}

}
