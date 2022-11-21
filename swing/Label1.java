
package swing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.Font;

public class Label1 extends JFrame{
   
    private Container c;
    private JLabel userLabel,passLabel;
    private Font f;
    
    Label1(){
         InitComponents();
    }
    
    public void InitComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        
        f=new Font("Arial",Font.BOLD,14);
        
        userLabel=new JLabel();
        userLabel.setText("Enter Your name:");
        userLabel.setBounds(50,20,200,50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.black);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.white);
        c.add(userLabel);
        
        passLabel=new JLabel("Enter Password:");
        passLabel.setBounds(50,80,200,50);
        passLabel.setFont(f);
        passLabel.setOpaque(true);
        passLabel.setForeground(Color.red);
        passLabel.setBackground(Color.white);
        c.add(passLabel);
    }
    
    public static void main(String[] args){
        
        Label1 frame=new Label1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Label");
        
    }
}
