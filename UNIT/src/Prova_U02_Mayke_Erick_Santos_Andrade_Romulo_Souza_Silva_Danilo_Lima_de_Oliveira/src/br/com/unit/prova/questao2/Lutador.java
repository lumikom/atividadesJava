package br.com.unit.prova.questao2;

public class Lutador implements Lutadores {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(float peso) {
		if (peso < 52.2) {
			this.categoria = "Não existe";
		} else if (peso > 52.3 && peso < 70.3) {
			this.categoria = "Peso leve";
		} else if (peso > 70.4 && peso < 83.9) {
			this.categoria = "Peso médio";
		} else if (peso > 84.0 && peso <= 120.2) {
			this.categoria = "Peso pesado";

		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	@Override
	public void apresentar() {
		System.out.println("Lutador: " + getNome() + "\nNacionalidade: " + getNacionalidade() + "\nIdade: " + getIdade()
				+ "\nPeso: " + getPeso() + "\nVitórias: " + getVitorias() + "\nEmpates: " + getEmpates()
				+ "\nDerrotas: " + getDerrotas());
	}

	@Override
	public void status() {
		System.out.println("Lutador: " + getNome() + "\nCategoria: " + getCategoria() + "\nVitórias: " + getVitorias()
				+ "\nEmpates: " + getEmpates() + "\nDerrotas: " + getDerrotas());
	}

	@Override
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}

	@Override
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}

	@Override
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;

	}
}
