package Polimorfismo2;

public class MountainBike extends Bicicleta {
	private String suspensao;
	public String getSuspensao() {
		return suspensao;
	}
	public void setSuspensao(String suspensao) {
		this.suspensao = suspensao;
	}
	@Override
	public String exibirDados() {
		
		return "Marcha: " + this.marcha + "Velocidade: " + this.velocidade + "Suspensão: " + this.suspensao;
	}

}
