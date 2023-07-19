package views;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static jdk.nashorn.tools.ShellFunctions.input;

public class PrimeiraInterface extends JFrame {
    
    public PrimeiraInterface(){
        super("Minha janela!");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        
     //  setLayout(new GridLayout(2, 1));
    //    setLayout(new BorderLayout());
         setLayout(null);
          setLocationRelativeTo(null);
         
          JTextField input = new JTextField();
         input.setBounds(200, 300, 150, 50);
         
         JLabel texto = new JLabel("Texto padrão");
         texto.setBounds(150, 100, 165, 20);
     
         JButton botao = new JButton("CLICK AQUI");
         add(botao, BorderLayout.CENTER);
        botao.setBounds(100, 50, 165, 25);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String mensagem = input.getText();
                texto.setText(mensagem);
            }
         });
         
         add(input);
         add(texto);
         add(botao);
         
          setVisible(true);
    }    
}
