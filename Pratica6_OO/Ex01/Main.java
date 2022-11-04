package Ex01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        
        String nomeProjeto;
        String descricao;
        String endereco;
        String datainicio;
        String datafim;

        int opcao; 

        Projeto proj1;
        Projeto proj2;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"<1>Cadastrar Projeto Trabalho Voluntário   \n<2> Cadastrar Projeto Distribuir Alimentos \n<3> Sair","Nossos Projetos",JOptionPane.PLAIN_MESSAGE));

           switch(opcao){
            case 1: 

            //1. Inputar valores pelo componente .showInputDialog do pacote .JOptionPane

            nomeProjeto = JOptionPane.showInputDialog(null, "nome do projeto: ");
            descricao = JOptionPane.showInputDialog(null, "descricao: ");
            endereco = JOptionPane.showInputDialog(null, "Endereço: ");
            datainicio = JOptionPane.showInputDialog(null, "Data Inicio: ");
            datafim = JOptionPane.showInputDialog(null, "Data Fim: ");
            
            
            //2. Criar objeto da classe e instanciar a classe; 
            proj1 = new TrabalhoVoluntario(nomeProjeto, descricao, endereco, datainicio, datafim, datafim, opcao);       
            
            //3. Mostrar na tela, usando compenente .showMessageDialog do pacote .JOptionPane

            JOptionPane.showMessageDialog(null,proj1.validaProjeto()+"\n"+proj1.imprimeProjeto(), "Sintese de projetos", JOptionPane.DEFAULT_OPTION);
            


            break; 

            case 2: 

            //1. Inputar valores pelo componente .showInputDialog do pacote .JOptionPane

            nomeProjeto = JOptionPane.showInputDialog(null, "nome do projeto: ");
            descricao = JOptionPane.showInputDialog(null, "descricao: ");
            endereco = JOptionPane.showInputDialog(null, "Endereço: ");
            datainicio = JOptionPane.showInputDialog(null, "Data Inicio: ");
            datafim = JOptionPane.showInputDialog(null, "Data Fim: ");
            
            
            //2. Criar objeto da classe e instanciar a classe; 
            proj2 = new DistribuicaoAlimento(nomeProjeto, descricao, endereco, datainicio, datafim, datafim, opcao);       
            
            //3. Mostrar na tela, usando compenente .showMessageDialog do pacote .JOptionPane

            JOptionPane.showMessageDialog(null,proj2.validaProjeto()+"\n"+proj2.imprimeProjeto(), "Sintese de projetos", JOptionPane.DEFAULT_OPTION);

            break;
            case 3:
            break;

            default:

            JOptionPane.showMessageDialog(null, "Escolha a opção correta", "Mensagem",JOptionPane.NO_OPTION);


           }


        }while(opcao != 3);
        
    }
}
