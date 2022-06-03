package Polimorfismo4;

public class Teste {
	public static void main(String[] args) {
		Jogador jog1 = new Jogador();
		jog1.atribuirNome("Rômulo");
		jog1.exibirNome();
		jog1.atribuirNome("Pedro");
		jog1.exibirNome();
		jog1.atacar();
	}

}
