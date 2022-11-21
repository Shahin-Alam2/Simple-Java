
package swing;

import javax.swing.JOptionPane;

public class ShowInput1 {
  public static void main(String[] args){
    String name;
     name=JOptionPane.showInputDialog("Enter Your Name:"); 
     JOptionPane.showMessageDialog(null,"Hi,"+ name+".Welcome to Swing.");
  }   
}
