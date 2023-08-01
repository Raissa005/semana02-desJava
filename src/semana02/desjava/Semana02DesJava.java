
package semana02.desjava;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import views.PomodoroAdvence;
//import views.SegundaInterface;
//import views.terceiraInterface;

public class Semana02DesJava {
   
    public static void main(String[] args) {        
       // metodoJoption()
       new PomodoroAdvence().setVisible(true);
       createIconTray();
    }
    
   public static void createIconTray(){
       if(SystemTray.isSupported()){
            System.out.println("Sem suporte");
            return;
       }
       String path = System.getProperty("user.dir") + File.separator + "semana02" +File.separator + "tray.png";
       Image icon = (Image) new ImageIcon(path).getImage();
       
       Popup
       TrayIcon tray = new TrayIcon(icon, "pomodoro");
       
       SystemTray bandeja = SystemTray.getSystemTray();
       
       try{
           bandeja.add(tray);
       }catch(Exception e){
           System.out.println("Não foi possiveeel");
       }
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
