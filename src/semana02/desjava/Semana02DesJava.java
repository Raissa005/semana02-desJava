
package semana02.desjava;

import java.util.Scanner;
import javax.swing.JOptionPane;
import views.SegundaInterface;

public class Semana02DesJava {
   
    public static void main(String[] args) {        
       // metodoJoption()
       new SegundaInterface().setVisible(true);
    }
    
    public static void metodoScanner(){
        
         String alunos[]= new String[5];
        boolean situacaoAlunos[] = new boolean [5];
        double alturaAlunos[] = new double[5];
        int idadeAlunos[] = new int[5];
        
        for (int i = 0; i < 6; i++){
         Scanner leitor = new Scanner(System.in);
                
        System.out.println("Informe seu nome>> ");
        alunos[i] = leitor.nextLine();      
        System.out.println("Olá "+ alunos +" , você estuda?");
        situacaoAlunos[i] = leitor.nextBoolean();
        System.out.println("Qual sua altura "+alunos);
         alturaAlunos[i] = leitor.nextDouble();
         System.out.println("Qual a sua idade?");
         idadeAlunos[i] = leitor.nextInt();
         }
        
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Nome "+ alunos[i] +" Estuda: "+ situacaoAlunos[i]);
        }
        
       /* while(leitor.hasNextInt()){
              int numero = leitor.nextInt();
        */
    }
    
    public static void metodoJoption(){
        System.out.println("Hello word!");
        String nome =  JOptionPane.showInputDialog(null, "Digite seu nome", "Titulo", JOptionPane.ERROR_MESSAGE);
      int idade =  Integer.parseInt( JOptionPane.showInputDialog(null, "Qual sua idade?", "Idade", JOptionPane.INFORMATION_MESSAGE));

       
       int compartilhar = JOptionPane.showConfirmDialog(null, "Deseja compartilhar suas informações?");
       if(compartilhar == JOptionPane.YES_OPTION){
           System.out.println("Você vai compartilhar suas informações!");
       }else if(compartilhar == JOptionPane.NO_OPTION){
           System.out.println("Suas informações não serão compartilhadas");
       }else if(compartilhar == JOptionPane.CANCEL_OPTION){
           System.out.println("Então finalizamos por aqui..");
       }
       
       int confirmar =  JOptionPane.showConfirmDialog(null, "Deseja confirmar cadastro?", "Cadastro", JOptionPane.YES_NO_OPTION);
       if(compartilhar == JOptionPane.YES_OPTION){          
       JOptionPane.showMessageDialog(null, "Deu certo!");
       }else if(compartilhar == JOptionPane.NO_OPTION){
       JOptionPane.showMessageDialog(null, "A casa caiu "+ nome+" !!", "DEU BO", JOptionPane.ERROR_MESSAGE);
       }
    }
}
