
package abstraction;

public class Test {
    public static void main(String[] args){
     
       MobileUser mu; //reference variable
       
       mu=new User1();
       mu.sendMessage();
       
       mu=new User2();
       mu.sendMessage();
    }
}
