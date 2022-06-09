package br.com.unit.prova.questao3;

public class Codigo {

	public static void main(String[] args) {
		
		String a = "Educara";
		String b = "Ação";
		
		b = geraStr(a, b);
		
		System.out.println(b);
	}
	
	public static String geraStr(String a, String b) {
		String s = "";
		
		for(int i = 0; i <= a.length() - 1; i++) {
			char c = a.charAt(i);
			s += Character.toString(c);
		}
		
		return s.concat(b.substring(1, 4));
	}
}


// Resposta: Educaração