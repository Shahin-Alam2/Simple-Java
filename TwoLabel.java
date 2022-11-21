
package examples;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;

public class TwoLabel {
    public static void main(String args[]){
        Frame f=new Frame("My Frame");
        
        Label l1=new Label("First");
        Label l2=new Label("Second");
        
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        
        Button b=new Button("OK");
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        
        f.setLayout(new FlowLayout());
        
        f.setSize(500,500);
        f.setVisible(true);
        
      //  obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
