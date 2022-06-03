package Polimorfismo3;

public class Carro extends Veiculo {
	private int marcha;

	
	
	
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	@Override
	public void acelera() {
		System.out.println("Acelerando o carro");

	}
@Override
public void freia() {
	System.out.println("Freiando o carro");
}
@Override
public void setVelocidade(double velocidade) {
this.velocidade= velocidade;}
	
}
