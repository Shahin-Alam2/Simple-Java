
package swing;

import javax.swing.JFrame;

public class Frame1 {
    public static void main(String[] args){
        
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        frame.setSize(400,300);
//        frame.setLocation(350,200); //from left 200,from top 50 pixel
        //setLocation n setSize er Combined form setBounds
        frame.setBounds(350,200,400,300); //1st 2 paramtre Location 2nd Size
        
        frame.setTitle("My 1st Frame");
        frame.setResizable(false);
    }
}
