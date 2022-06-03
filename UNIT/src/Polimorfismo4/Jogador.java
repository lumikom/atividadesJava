package Polimorfismo4;

public class Jogador extends Personagem {
	protected int pontosMagia, experienciaAtual, experienciaProximoNivel;

	@Override
	public void exibirNome() {
		System.out.println("Nome do jogador:" + this.nome);

	}
}
