package br.com.unit.me;

public class Produto implements Item{

	private String nome;
	private int id;
	private double preco;
	private String categoria;
	
	public Produto(String nome, int id, double preco, String categoria) {
		this.nome = nome;
		this.id = id;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	@Override
	public void displayItem() {
		System.out.println("----| Produto |----");
		System.out.println("Nome: " + this.getNome() + "\n" + 
						   "Id: " + this.getId() + "\n" + 
						   "Preço: " + this.getPreco() + "\n" +
						   "Caregoria: " + this.categoria);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
