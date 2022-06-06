package br.com.unit.me;

public class Contador extends Gerente {
	private double salario;
	private String turno;
	private int horasTrabalho;

	public Contador(String nome, int idade, String sexo, int id, 
					String codigoUniforme, String numeroTelefone,String departamento, 
					String qualificacao, double salario, String turno, int horasTrabalho) {
		
		super(departamento, qualificacao, id, codigoUniforme, numeroTelefone, nome, idade, sexo);
		this.salario = salario;
		this.turno = turno;
		this.horasTrabalho = horasTrabalho;
	}
	
	public void displayContador() {
		System.out.println("----| Diretor |----");
		System.out.println("Nome: " + super.getNome() + "\n" + 
						   "Idade: " + super.getIdade() + "\n" +
						   "Id: " + super.getId() + "\n" + 
						   "Sexo: " + super.getSexo() + "\n" +
						   "Código do Uniforme: " + super.getCodigoUniforme() + "\n" +
						   "Número do telefone: " + super.getNumeroTelefone() + "\n" +
						   "Departamento: " + super.getDepartamento() + "\n" +
						   "Qualificação: " + super.getQualificacao() + "\n" + 
						   "Salário: " + this.salario + "\n" +
						   "Turno do trabalho: " + this.getTurno() + "\n" + 
						   "Horas de trabalho: " + this.getHorasTrabalho());
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getHorasTrabalho() {
		return horasTrabalho;
	}

	public void setHorasTrabalho(int horaTrabalho) {
		this.horasTrabalho = horaTrabalho;
	}
	
	
}
