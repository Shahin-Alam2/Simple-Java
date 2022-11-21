
package texteditor;

public class textEditorGUI extends javax.swing.JFrame {
    
    public textEditorGUI(){
        //initComponents();
    }
    
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new textEditorGUI().setVisible(true);
            }
        });
    }
}
