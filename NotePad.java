
package javaswing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class NotePad extends JFrame implements ActionListener{
    private Container c;
    private JTextArea ta;
    private JButton btn;
    private JFileChooser chooser;
    NotePad(){
        c = this.getContentPane();
        c.setLayout(null);
        
        ta = new JTextArea();
        ta.setBounds(20,10,850,500);
        c.add(ta);
        
        btn = new JButton("Read");
        btn.setBounds(430,520,150,50);
        c.add(btn);
        
        btn.addActionListener(this);
        
        
    }
    
    public static void main(String[] args) {
        
        NotePad frame = new NotePad();
        frame.setVisible(true);
        frame.setBounds(200,100,900,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NotePad");
        frame.setResizable(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          chooser = new JFileChooser();
          chooser.showOpenDialog(null);
          File file = chooser.getSelectedFile();
          Scanner input = new Scanner(file);
          while()
    }
    
}
