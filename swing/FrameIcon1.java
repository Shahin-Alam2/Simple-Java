
package swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;

public class FrameIcon1 extends JFrame{
    
    private ImageIcon icon;
    private Container c;
    
    FrameIcon1(){
        InitComponents();
      }
    public void InitComponents(){
        c=this.getContentPane();
        c.setBackground(Color.green);
       icon=new ImageIcon(getClass().getResource("BD-icon.png")); 
       this.setIconImage(icon.getImage());
    }
    
    
    public static void main(String[] args){
    
    FrameIcon1 frame=new FrameIcon1();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.setBounds(350,200,500,400);
    frame.setTitle("Frame with BD icon");
    frame.setResizable(false);
   
    }
}
