package Polimorfismo2;

public class Ciclismo extends Bicicleta{
private int espessuraPneu;



public int getEspessuraPneu() {
	return espessuraPneu;
}
public void setEspessuraPneu(int espessuraPneu) {
	this.espessuraPneu = espessuraPneu;
}

@Override
public String exibirDados() {
	
	return "Marcha: " + this.marcha + "Velocidade: " + this.velocidade + "Espessura do Pneu: " + this.espessuraPneu;

}}
