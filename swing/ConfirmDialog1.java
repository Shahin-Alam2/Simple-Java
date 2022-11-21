
package swing;

import javax.swing.JOptionPane;

public class ConfirmDialog1 {
  public static void main(String[] args){
      
      int choice=JOptionPane.showConfirmDialog(null,"Do u want to quit?","Title",JOptionPane.YES_NO_CANCEL_OPTION);
  
      if(choice==JOptionPane.YES_OPTION){
         //System.out.println("You clicked YES option");
         System.exit(0);
      }
      else if(choice==JOptionPane.NO_OPTION){
          System.out.println("You clicked NO option.");
      }
      else if(choice==JOptionPane.CANCEL_OPTION){
          System.out.println("You clicked CANCEL option.");
      }
  }  
}
