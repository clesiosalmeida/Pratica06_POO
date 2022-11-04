package Ex03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Variaveis de Edicao
        int numero, volume, triagem; 
        String dataEdicao; 
        //Variaveis de Revista
        String tituloRevista, periodicidade; 
        long issn; 
        //Variaveis do Artigo
        String titulo;
        String resumo;
        String autores;


        /*--------------------------------------- */

        tituloRevista = JOptionPane.showInputDialog("Titulo da revista: ");
        issn = Long.parseLong(JOptionPane.showInputDialog("ISSN: ")); 
        periodicidade = JOptionPane.showInputDialog("Periodicidade: ");


        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
        volume = Integer.parseInt(JOptionPane.showInputDialog("volume: "));
        triagem = Integer.parseInt(JOptionPane.showInputDialog("triagem: "));
        dataEdicao = JOptionPane.showInputDialog("dataEdicao: ");

        /*------------------------------------------ */

        Edicao ed1 = new Edicao(numero, volume, dataEdicao, triagem);
        RevistaCientifica revista1 = new RevistaCientifica(tituloRevista, issn, periodicidade);

        ArrayList<Artigo> artigos = new ArrayList<>();

        for (int i = 0; i<10; i++){
            titulo = JOptionPane.showInputDialog("Titulo do Artigo");
            resumo =JOptionPane.showInputDialog("Reumo");
            autores = JOptionPane.showInputDialog("Autores"); 

            artigos.add(new Artigo(titulo, resumo, autores));
            ed1.adicionaArtigos((artigos.get(i)));//adiciona os artigos dentro da Edição
        }
        
    }
}
