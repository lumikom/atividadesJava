package Polimorfismo3;

public class Teste {
public static void main(String[] args) {
	Carro c1 = new Carro();
	c1.setModelo("Onix");
	c1.setVelocidade(4);
	c1.setMarcha(6);
	c1.setPassageiros(4);
	c1.setCombustivel(50);
	c1.acelera();
	c1.freia();
	
	System.out.println(c1.getMarcha());
}
}