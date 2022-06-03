package Polimorfismo4;

public class Monstro extends Personagem{

	protected int experiencia;
	
	@Override
	public void exibirNome() {
		System.out.println("Nome do monstro: "+ this.nome);
	}
}