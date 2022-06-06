package br.com.unit.me;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	private String nomeLoja;
	private String localLoja;
	private String numeroContrato;
	private ArrayList<Proprietario> proprietarios = new ArrayList<>();
	private ArrayList<Diretor> diretores = new ArrayList<>();
	private ArrayList<Contador> contadores = new ArrayList<>();
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private ArrayList<Produto> produtos = new ArrayList<>();

	public Loja(String nomeLoja, String localLoja, String numeroContrato) {
		this.nomeLoja = nomeLoja;
		this.localLoja = localLoja;
		this.numeroContrato = numeroContrato;
	}

	public Loja(String nomeLoja, String localLoja, String numeroContrato, 
				ArrayList<Proprietario> proprietarios,ArrayList<Diretor> diretores, 
				ArrayList<Contador> contadores, ArrayList<Funcionario> funcionarios,
				ArrayList<Produto> produtos) {
		
		this.nomeLoja = nomeLoja;
		this.localLoja = localLoja;
		this.numeroContrato = numeroContrato;
		this.proprietarios = proprietarios;
		this.diretores = diretores;
		this.contadores = contadores;
		this.funcionarios = funcionarios;
		this.produtos = produtos;
	}
	
	public void displayLoja() {
		System.out.println("----| Loja |----");
		System.out.println("Nome: " + this.nomeLoja + "\n" + 
						   "Local: " + this.localLoja + "\n" + 
						   "N�mero do contraro: " + this.numeroContrato );
	}
	
	public void adicionarDiretor(Diretor diretor) {
		this.getDiretores().add(diretor);
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		this.getFuncionarios().add(funcionario);
	}
	
	public void adicionarContador(Contador contador) {
		this.getContadores().add(contador);
	}
	
	public void adicionarProprietario(Proprietario proprietario) {
		this.getProprietarios().add(proprietario);
	}
	
	public void adicionarProdutos(Produto produto) {
		this.getProdutos().add(produto);
	}
	
	public void imprimirDiretores() {
		for(Diretor aux: getDiretores() ) {
			aux.displayDiretor();
		}
	}
	
	public void imprimirFuncionarios() {
		for(Funcionario aux: getFuncionarios() ) {
			aux.displayFuncionario();
		}
	}
	
	public void imprimirContadores() {
		for(Contador aux: getContadores() ) {
			aux.displayContador();
		}
	}
	
	public void imprimirProprietarios() {
		for(Proprietario aux: getProprietarios() ) {
			aux.displayProprietario();
		}
	}
	
	public void imprimirProdutos() {
		for(Produto aux: getProdutos() ) {
			aux.displayItem();
		}
	}
	
	public void buscarDiretores(int id) {
        for(Diretor aux: getDiretores())
            if(aux.getId() == id) {
            	aux.displayDiretor();
            }        
	}
	
	public void buscarFuncionarios(int id) {
        for(Funcionario aux: getFuncionarios())
            if(aux.getId() == id) {
            	aux.displayFuncionario();
            }        
	}
	
	public void buscarContadores(int id) {
        for(Contador aux: getContadores())
            if(aux.getId() == id) {
            	aux.displayContador();
            }        
	}
	
	public void buscarProdutos(int id) {
        for(Produto aux: getProdutos())
            if(aux.getId() == id) {
            	aux.displayItem();
            }        
	}
	
	public void buscarProprietarios(String nome) {
        for(Proprietario aux: getProprietarios())
            if(aux.getNome() == nome) {
            	aux.displayProprietario();
            }        
	}
	
	public void deletarDiretores(int id) {
        for(Diretor aux: getDiretores())
            if(aux.getId() == id) {
            	getDiretores().remove(id);
            }        
	}
	
	public void deletarFuncionarios(int id) {
        for(Funcionario aux: getFuncionarios())
            if(aux.getId() == id) {
            	getFuncionarios().remove(id);
            }        
	}
	
	public void deletarContadores(int id) {
        for(Contador aux: getContadores())
            if(aux.getId() == id) {
            	getContadores().remove(id);
            }        
	}
	
	public void deletarProdutos(int id) {
        for(Produto aux: getProdutos())
            if(aux.getId() == id) {
            	getProdutos().remove(id);
            }        
	}

	public ArrayList<Proprietario> getProprietarios() {
		return proprietarios;
	}

	public ArrayList<Diretor> getDiretores() {
		return diretores;
	}

	public ArrayList<Contador> getContadores() {
		return contadores;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	

}