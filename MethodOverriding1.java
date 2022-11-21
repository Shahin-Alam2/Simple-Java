
package Ep_100_Plus;

public class MethodOverriding1 extends InheritPerson{

    String Status;
    
    @Override
    void Display1(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Status: "+Status);
      
    }
}
