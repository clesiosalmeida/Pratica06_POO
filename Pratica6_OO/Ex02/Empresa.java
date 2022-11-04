/*
 Crie uma classe Empresa que possua: "nome”, “cnpj”, “qtde_de_funcionario” 
 
 e um array de objetos da classe Funcionario (o array pode armazenar até 100 funcionários).
 */



package Ex02;

public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private int qtdeDeFuncionarios;

    Funcionario[] funcionarios;

    private static int count = 0; //Variável estática.

    

    public Empresa(String nomeEmpresa, String cnpj, int qtdeDeFuncionarios) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        

        if(qtdeDeFuncionarios<=100){
            this.qtdeDeFuncionarios = qtdeDeFuncionarios;
            funcionarios = new Funcionario[qtdeDeFuncionarios]; 
        }else{
            this.qtdeDeFuncionarios = 100;
            funcionarios = new Funcionario[100]; 
        }
    }



    public String getNomeEmpresa() {
        return nomeEmpresa;
    }



    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }



    public String getCnpj() {
        return cnpj;
    }



    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }



    public int getQtdeDeFuncionarios() {
        return qtdeDeFuncionarios;
    }



    public void setQtdeDeFuncionarios(int qtdeDeFuncionarios) {
        this.qtdeDeFuncionarios = qtdeDeFuncionarios;
    }

    public void insereFuncionario(Funcionario func){
        funcionarios[count]=func;
    }



    
}
