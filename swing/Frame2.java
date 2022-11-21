
package swing;

import javax.swing.JFrame;

public class Frame2 extends JFrame{
    
    Frame2(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(350,200,500,400);
    setTitle("Frame by Constructor");
    setResizable(false);
}
    public static void main(String[] args){
    
    Frame2 frame=new Frame2();
    frame.setVisible(true);
    }
}
