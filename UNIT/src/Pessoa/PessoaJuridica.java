package Pessoa;

public class PessoaJuridica extends Pessoa {
    
    

    String cnpj, incEstadual, nomeFantasia, razSocial;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncEstadual() {
        return incEstadual;
    }

    public void setIncEstadual(String incEstadual) {
        this.incEstadual = incEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazSocial() {
        return razSocial;
    }

    public void setRazSocial(String razSocial) {
        this.razSocial = razSocial;
    }

    @Override
    public String Imprimir() {
        return "Nome: "+ getNome()+ "\nCPNJ: " + this.cnpj + "\nInscrição Estadual:"+ this.incEstadual+ "\nNome Fantasia:"+ this.nomeFantasia+ "\nRazão Social:"+ this.razSocial;
    }

    public PessoaJuridica(String nome, String cnpj, String incEstadual, String nomeFantasia, String razSocial) {
        super(nome);
        this.cnpj = cnpj;
        this.incEstadual = incEstadual;
        this.nomeFantasia = nomeFantasia;
        this.razSocial = razSocial;
    }
   

    
    
    
}
