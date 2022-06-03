package Pessoa;


public class PessoaFisica extends Pessoa {
    private String cpf;
    private int dataNasc;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }
   
    
    public PessoaFisica(String nome, String cpf, int dataNasc) {
        super(nome);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
   public String Imprimir(){
       return "Nome: "+ getNome()+", CPF: "+ this.cpf + ", Nascimento: "+ this.dataNasc;
   }
        

        
    
    
        

     
        
    

    
        
    }
    
    
