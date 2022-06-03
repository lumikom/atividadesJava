package Polimorfismo2;

public class Teste {
	public static void main(String[] args) {
		Bicicleta b2 = new Bicicleta();
		b2.setMarcha(2);
		b2.setVelocidade(40);
		System.out.println(b2.exibirDados());
		
		MountainBike m2 = new MountainBike();
		m2.setMarcha(3);
		m2.setSuspensao("Suspensão 3");
		m2.setVelocidade(50);
		System.out.println(m2.exibirDados());
		
		Ciclismo c2 = new Ciclismo();
		c2.setEspessuraPneu(4);
		c2.setMarcha(4);
		c2.setVelocidade(55);
		System.out.println(c2.exibirDados());
	}
	
	

}
