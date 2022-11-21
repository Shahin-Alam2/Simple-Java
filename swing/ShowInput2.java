
package swing;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ShowInput2 {
  public static void main(String[] args){
      
      String first,second,name;
      
      ImageIcon img=new ImageIcon("Shahin.jpg");
      first=JOptionPane.showInputDialog(null,"Enter First name","Who is it?",JOptionPane.INFORMATION_MESSAGE);
      second=JOptionPane.showInputDialog("Last name:");
      name=first+" "+second;
      JOptionPane.showMessageDialog(null,"Name: "+name);
  }    
}
