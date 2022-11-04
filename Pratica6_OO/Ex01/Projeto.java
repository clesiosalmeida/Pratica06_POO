package Ex01;

public abstract class Projeto { //classe abstrata
    
    //atributos
    private String nomeProjeto;
    private String descricao;
    private String endereco;
    private String datainicio;
    private String datafim;
   
    //constructor
   
    public Projeto(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    //getters and setters
    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    // metodos abstratos 

    public abstract boolean validaProjeto(); 
    public abstract String imprimeProjeto();

    @Override
    public String toString() {
        return "Projeto [nomeProjeto=" + nomeProjeto + ", descricao=" + descricao + ", endereco=" + endereco
                + ", datainicio=" + datainicio + ", datafim=" + datafim + "]";
    }

    

    


    
}
