package Ex02;


public class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG; 
    private boolean status;
    


    public Funcionario(String nome, String email, String telefone, String departamento, double salario,
            String dataEntrada, String rG) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        RG = rG;
        this.status = status;
    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String getDataEntrada() {
        return dataEntrada;
    }


    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }


    public String getRG() {
        return RG;
    }


    public void setRG(String rG) {
        RG = rG;
    }


    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    } 

    public void bonificar(double percentual){
        this.salario = this.salario*(1+(percentual/100));
    }

    public void demitir(){
        if(this.status == true){
            this.status = false;
        }
    }


    public String mostrarDados(){
        return " nome: "+getNome()+"\n e-mail: "+getEmail()+"\n telefone"+getTelefone()+"\n departamento: " + getDepartamento() + "\n salario: " + getSalario() + "\n dataEntrada: " + getDataEntrada()
        + "\n RG: " + getRG() + "\n status: " + isStatus();
    }
    
    
}
