package br.com.unit.prova.questao2;

public class Main {

	public static void main(String[] args) {
		Lutador[] arrayLutadores = new Lutador[6];
		Lutador lut1 = new Lutador("Danilo", "Brasileiro", 18, (float) 1.75, 80, 0, 0, 0);
		lut1.setCategoria(80);
		Lutador lut2 = new Lutador("Mayke Aranha", "Brasileiro", 19, (float) 1.74, 60, 0, 0, 0);
		lut2.setCategoria(60);
		Lutador lut3 = new Lutador("Muralha", "Brasileiro", 20, (float) 2, 62, 0, 0, 0);
		lut3.setCategoria(62);
		Lutador lut4 = new Lutador("Pedro", "Brasileiro", 22, (float) 1.70, 81, 0, 0, 0);
		lut4.setCategoria(85);
		Lutador lut5 = new Lutador("Gustavo", "Brasileiro", 21, (float) 1.67, 105, 0, 0, 0);
		lut5.setCategoria(105);
		Lutador lut6 = new Lutador("Jorge", "Brasileiro", 24, (float) 1.67, 119, 0, 0, 0);
		lut6.setCategoria(119);

		arrayLutadores[0] = lut1;
		arrayLutadores[1] = lut2;
		arrayLutadores[2] = lut3;
		arrayLutadores[3] = lut4;
		arrayLutadores[4] = lut5;
		arrayLutadores[5] = lut6;

		Luta luta1 = new Luta();
		luta1.marcarLuta(lut1, lut4);
		luta1.lutar();

		System.out.println("\n");

		Luta luta2 = new Luta();
		luta2.marcarLuta(lut6, lut5);
		luta2.lutar();

		System.out.println("\n");
		Luta luta3 = new Luta();
		luta3.marcarLuta(lut3, lut2);
		luta3.lutar();

		System.out.println("\n");
		Luta luta4 = new Luta();
		luta4.marcarLuta(lut1, lut6);
		luta4.lutar();

		System.out.println("\n");
		lut1.apresentar();
		System.out.println("\n");
		lut2.apresentar();
		System.out.println("\n");
		lut3.apresentar();
		System.out.println("\n");
		lut4.apresentar();
		System.out.println("\n");
		lut5.apresentar();
		System.out.println("\n");
		lut6.apresentar();

	}
}
