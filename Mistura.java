package maria;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Mistura extends JFrame{
    
    private JButton cad;
    private JPasswordField senha;
    private JTextField usu;
    
    public Mistura(){
    
        super("Cadastro de usuário");
        setLayout(new FlowLayout());
        
        usu = new JTextField("nome para usuario...");
        usu.setEditable(true);
        add(usu);
        
        senha = new JPasswordField("", 20);
        add(senha);
        
        cad = new JButton("Cadastrar");
        add(cad);
        
        Handler h = new Handler();
        usu.addActionListener(h);
        senha.addActionListener(h);
        cad.addActionListener(h);      
    }
    
    private class Handler implements ActionListener{
    
        public void actionPerformed(ActionEvent event){
            
            if(event.getSource() == cad){
                JOptionPane.showMessageDialog(null,"\nCadastrado com sucesso", "Cadatro de usuário", JOptionPane.PLAIN_MESSAGE);
            }
        }

    }
}
