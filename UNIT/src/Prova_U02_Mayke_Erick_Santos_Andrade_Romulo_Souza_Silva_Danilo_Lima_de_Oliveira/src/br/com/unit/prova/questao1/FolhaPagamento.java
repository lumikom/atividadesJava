package br.com.unit.prova.questao1;
import java.util.ArrayList;

public class FolhaPagamento {
 
	public static void main(String[] args) {
		
		PorComissao funcComissao = new PorComissao("Mayke", 10);
		funcComissao.setVendas(-1);
		PorHora funcHora = new PorHora("Erick", 20, 12);
		PorHoraComissao funcHoraComissao = new PorHoraComissao("Romulo", 20, 12, 10);
		funcHoraComissao.setVendas(-1);
				
		ArrayList<Funcionario> listaFunc= new ArrayList<>();
		listaFunc.add(funcComissao);
		listaFunc.add(funcHora);
		listaFunc.add(funcHoraComissao);
		
		for(Funcionario aux : listaFunc) {
			System.out.println(aux.getPagamento());
		}
		
	}
}
