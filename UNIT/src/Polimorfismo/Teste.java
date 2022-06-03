package Polimorfismo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;





public class Teste {
public static void main(String[] args) {
	/*
	 * Date data = new Date(); Carta carta1 = new Carta(); carta1.setAutor("Pedro");
	 * carta1.setDataDeCriacao(data); carta1.setFormaEnvio("Correios");
	 * carta1.setEndereco("Rua 5"); System.out.println(carta1.Editar());
	 * System.out.println(carta1.Anexar()); System.out.println(carta1.Imprimir());
	 * System.out.println(carta1.getAutor());
	 * System.out.println(carta1.getEndereco());
	 * System.out.println(carta1.getFormaEnvio());
	 * System.out.println(carta1.getDataDeCriacao());
	 * 
	 * Telegrama teleg1 = new Telegrama(); System.out.println(teleg1.Editar());
	 * System.out.println(teleg1.Pagar()); System.out.println(teleg1.Imprimir());
	 * 
	 * Email email1 = new Email(); System.out.println(email1.Imprimir());
	 * System.out.println(email1.Enviar()); System.out.println(email1.Editar());
	 */
	/*Documento[] listaDocumentos = new Documento[3];
	listaDocumentos[0] = new Carta();
	listaDocumentos[1] = new Telegrama();
	listaDocumentos[2] = new Email();
	System.out.println(listaDocumentos);
	for( int i =0; 1< listaDocumentos.length; i++) {
	 listaDocumentos.*/

	ArrayList<Documento> listaDocs = new ArrayList<>();
	Carta carta1 = new Carta();
	Telegrama teleg1 = new Telegrama();
	Email email1 = new Email();
	
	
		
	listaDocs.add(email1);
	listaDocs.add(teleg1);
	listaDocs.add(carta1);
	
	
	listaDocs.forEach(t -> System.out.println(t.Imprimir()));
	listaDocs.forEach(t -> System.out.println(t.Editar()));
	System.out.println(email1.Enviar());
	}
	
	
	
	
			

}
