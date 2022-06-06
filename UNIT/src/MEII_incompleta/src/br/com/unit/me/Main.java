package br.com.unit.me;

import java.util.Scanner;

public class Main {

	private static final String comercio = "Comércio";
	private static final String formal = "Turno Formal";
	private static final String FC = "Finança e economia";
	
	public static void main(String[] args) {
		Loja loja = new Loja("Moniery", "Areia Branca", "123456");
		Proprietario mayke = new Proprietario(10000, "Mayke", 19, "Masculino");
		Proprietario romulo = new Proprietario(10000, "Rômulo", 20, "Masculino");
		Proprietario rose = new Proprietario(10000, "Rose", 55, "Feminino");
		
		loja.adicionarProprietario(mayke);
		loja.adicionarProprietario(romulo);
		loja.adicionarProprietario(rose);
		
		Funcionario fun1 = new Funcionario("Susan", 19, "Feminino", 1, "10", "91111-1111", 2000, "Manhã", 8);
		Funcionario fun2 = new Funcionario("Gustavo", 20, "Masculino", 2, "10", "91111-1111", 2000, "Manhã", 8);
		Funcionario fun3 = new Funcionario("Yuri", 21, "Masculino", 3, "10", "91111-1111", 2000, "Manhã", 8);
		Funcionario fun4 = new Funcionario("Vini", 22, "Masculino", 4, "10", "91111-1111", 2000, "Manhã", 8);
		Funcionario fun5 = new Funcionario("Victor", 23, "Masculino", 5, "10", "91111-1111", 2000, "Manhã", 8);
		Funcionario fun6 = new Funcionario("Luiza", 24, "Feminino", 6, "10", "91111-1111", 2000, "Manhã", 8);
		
		loja.adicionarFuncionario(fun1);
		loja.adicionarFuncionario(fun2);
		loja.adicionarFuncionario(fun3);
		loja.adicionarFuncionario(fun4);
		loja.adicionarFuncionario(fun5);
		loja.adicionarFuncionario(fun6);
		
		Contador con1 = new Contador("Lucas", 20, "Masculino", 7, "11", "91111-1111", "Economia", "Unit", 5000, "Manhã", 8);
		
		loja.adicionarContador(con1);
		
		Diretor dr1 = new Diretor("Nich", 27,"Masculino", 8, "12", "91111-1111", "Direção", "UFS", 8000, "Manhã", 8);
		Diretor dr2 = new Diretor("Kevin", 27,"Masculino", 9, "12", "91111-1111", "Direção", "São Luís de França", 8000, "Manhã", 8);
		
		loja.adicionarDiretor(dr1);
		loja.adicionarDiretor(dr2);
		
		Produto pr1 = new Produto("Coca-cola", 1, 2, "Bebidas");
		Produto pr2 = new Produto("Pepsi", 2, 2, "Bebidas");
		Produto pr3 = new Produto("Del vale Kappo", 3, 5, "Bebidas");
		
		loja.adicionarProdutos(pr1);
		loja.adicionarProdutos(pr2);
		loja.adicionarProdutos(pr3);
		
		Produto pr4 = new Produto("Pão", 4, 1, "Café da manhã");
		Produto pr5 = new Produto("Pão de Queijo", 5, 3, "Café da manhã");
		Produto pr6 = new Produto("Presunto", 6, 3, "Café da manhã");
		Produto pr7 = new Produto("Pão Integral", 7, 3, "Café da manhã");
		Produto pr8 = new Produto("Café", 8, 7, "Café da manhã");
		
		loja.adicionarProdutos(pr4);
		loja.adicionarProdutos(pr5);
		loja.adicionarProdutos(pr6);
		loja.adicionarProdutos(pr7);
		loja.adicionarProdutos(pr8);
		
		Produto pr9 = new Produto("Sal", 9, 2, "Condimentos");
		Produto pr10 = new Produto("Pimenta", 10, 3, "Condimentos");
		Produto pr11 = new Produto("Mostarda", 11, 5, "Condimentos");
		Produto pr12 = new Produto("Vinagre", 12, 4, "Condimentos");
		Produto pr13 = new Produto("Açucar", 13, 2, "Condimentos");
		
		loja.adicionarProdutos(pr9);
		loja.adicionarProdutos(pr10);
		loja.adicionarProdutos(pr11);
		loja.adicionarProdutos(pr12);
		loja.adicionarProdutos(pr13);
		
		Produto pr14 = new Produto("Queijo", 14, 2, "Laticínios");
		Produto pr15 = new Produto("Sorvete", 15, 2, "Laticínios");
		Produto pr16 = new Produto("Leite Condensado", 16, 2, "Laticínios");
		Produto pr17 = new Produto("Iogurte", 17, 2, "Laticínios");
		
		loja.adicionarProdutos(pr14);
		loja.adicionarProdutos(pr15);
		loja.adicionarProdutos(pr16);
		loja.adicionarProdutos(pr17);
		
		Produto pr18 = new Produto("Cuscuz", 18, 2, "Jantar");
		Produto pr19 = new Produto("Ovo", 19, 2, "Jantar");
		Produto pr20 = new Produto("Macaxeira", 20, 2, "Jantar");

		loja.adicionarProdutos(pr18);
		loja.adicionarProdutos(pr19);
		loja.adicionarProdutos(pr20);
		
		
		loop: while(true) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("----| Loja |----\n\n"
							 + "1) Adicionar \n"
							 + "2) Imprimir \n"
							 + "3) Buscar \n"
							 + "4) Deletar \n"
							 + "5) Gerenciar Produtos \n"
							 + "6) Sair");
			
			System.out.println("input: ");
			int choice = input.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("1) Adicionar Contador \n"
								 + "2) Adicionar Diretor \n"
								 + "3) Adicionar Funcionario \n"
								 + "4) Voltar");
				
				System.out.println("input: ");
				int choice2 = input.nextInt();
				
				if (choice2 == 4) {					
					break;
				}
			
			case 2:
				System.out.println("1) Imprimir Proprietario \n"
						 		 + "2) Imprimir Contador \n"
						 		 + "3) Imprimir Diretor \n"
						 		 + "4) Imprimir Funcionario \n"
						 		 + "5) Voltar");
				
				System.out.println("input: ");
				int choice3 = input.nextInt();
				
				if(choice3 == 5) {
					break;
				}
				
			case 3:
				System.out.println("1) Buscar Proprietario \n"
				 		 		 + "2) Buscar Contador \n"
				 		 		 + "3) Buscar Diretor \n"
				 		 		 + "4) Buscar Funcionario \n"
				 		 		 + "5) Voltar");
				
				System.out.println("input: ");
				int choice4 = input.nextInt();
				
				if(choice4 == 5) {
					break;
				}
				
			case 4:
				System.out.println("1) Deletar Proprietario \n"
		 		 		 		 + "2) Deletar Contador \n"
		 		 		 		 + "3) Deletar Diretor \n"
		 		 		 		 + "4) Deletar Funcionario \n"
		 		 		 		 + "5) Voltar");
				
				System.out.println("input: ");
				int choice5 = input.nextInt();
				
				if(choice5 == 5) {
					break;
				}
				
			case 5:
				System.out.println("1) Adicionar Produto \n"
		 		 		 		 + "2) Imprimir todos os produtos \n"
		 		 		 		 + "3) Imprimir produtos por categorias \n"
		 		 		 		 + "4) Buscar produtos \n"
		 		 		 		 + "5) Deletar produtos \n"
		 		 		 		 + "6) Voltar");
				
				System.out.println("input: ");
				int choice6 = input.nextInt();
				
				if(choice6 == 6) {
					break;
				}
				
			case 6:
				break loop;
			}
		}	
		
	}
}
