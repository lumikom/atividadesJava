package Polimorfismo;

import java.util.Date;

public class Documento {
private String autor;
private Date dataDeCriacao;
public String Imprimir() {
	return "Imprimindo";}
public String Editar() {
	return "Editando";
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public Date getDataDeCriacao() {
	return dataDeCriacao;
}
public void setDataDeCriacao(Date dataDeCriacao) {
	this.dataDeCriacao = dataDeCriacao;
}
}
