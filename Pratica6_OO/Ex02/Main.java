package Ex02;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String departamento;
        double salario;
        String dataEntrada;
        String RG; 
       // boolean status;
        String nomeEmpresa;
        String cnpj;
        int qtdeDeFuncionarios;
        String nome;
        String email;
        String telefone;
        
        Funcionario func;
        Empresa emp1;


        /*
         Crie 10 objetos da classe Funcionário e insira-os em um array de objetos dessa classe. Utilize um for para imprimir todos os atributos dos objetos do array.
         */

         Funcionario[] funcionarios = new Funcionario[10];

         for(int i=0;i<3;i++){
            nome = JOptionPane.showInputDialog("Nome");
            email = JOptionPane.showInputDialog("email");
            telefone = JOptionPane.showInputDialog("telefone");
            departamento = JOptionPane.showInputDialog("departamento");
            salario = Double.parseDouble(JOptionPane.showInputDialog("salario"));
            dataEntrada = JOptionPane.showInputDialog("dataEntrada");
            RG = JOptionPane.showInputDialog("RG");

            func = new Funcionario(nome, email, telefone, departamento, salario, dataEntrada, RG);

            funcionarios[i] = func;
         }

         
         nomeEmpresa = JOptionPane.showInputDialog(null,"Digite nome da empresa"); 
         cnpj = JOptionPane.showInputDialog("Informe o CNPJ");
         qtdeDeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funcionário"));  
         emp1 = new Empresa(nomeEmpresa, cnpj, qtdeDeFuncionarios);

         for(Funcionario func1:funcionarios){
            emp1.insereFuncionario(func1);
            System.out.println(func1.mostrarDados());
         }
    }
}
