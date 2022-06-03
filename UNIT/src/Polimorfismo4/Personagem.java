package Polimorfismo4;

public class Personagem {
	protected String nome;
	protected int forca, vidas, magia, velocidade, defesa, nivel;

	public void atacar() {
		System.out.println("Personagem atacou");
	}

	public void defender() {
		System.out.println("Personagem defendeu");
	}

	public void usarMagia() {
		System.out.println("Personagem usou magia");
	}

	public void atribuirNome(String nome) {
		this.nome = nome;

	}

	public String retornarNome() {
		return nome;
	}

	public void exibirNome() {
		System.out.println(this.nome);
	}

}
