package Ex03;

public class RevistaCientifica {
    private String tituloRevista;
    private long issn;
    private String peridiocidade; 
    private Edicao edicoes;


    public String getTituloRevista() {
        return tituloRevista;
    }


    public void setTituloRevista(String tituloRevista) {
        this.tituloRevista = tituloRevista;
    }


    public long getIssn() {
        return issn;
    }


    public void setIssn(long issn) {
        this.issn = issn;
    }


    public String getPeridiocidade() {
        return peridiocidade;
    }


    public void setPeridiocidade(String peridiocidade) {
        this.peridiocidade = peridiocidade;
    }


    public Edicao getEdicoes() {
        return edicoes;
    }


    public void setEdicoes(Edicao edicoes) {
        this.edicoes = edicoes;
    }


    
    
    public RevistaCientifica(String tituloRevista, long issn, String peridiocidade) {
        this.tituloRevista = tituloRevista;
        this.issn = issn;
        this.peridiocidade = peridiocidade;
    }


    public void adicionaEdicao(){
        
    }
}
