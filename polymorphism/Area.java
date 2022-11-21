
package polymorphism;

public class Area {
    public static void main(String[] args){
        Shape[] s=new Shape[3];
        
         s[0]=new Shape();  //new er pore ja lekha hobe tai object r ekhane s[0] variable
         s[1]=new Triangle(10,20);
         s[2]=new Rectangle(10,20);
        
         for(int i=0;i<3;i++){
        System.out.println(s[i].area());
         }
    }
}
