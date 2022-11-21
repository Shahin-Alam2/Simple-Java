
package Ep_100_Plus;

public class Inheritance1 {
    public static void main(String[] args){
        InheritTeacher t1=new InheritTeacher();
        t1.name="Shahin Alam";
        t1.age=20;
        t1.qualification="BSC in CSE";
        t1.Display2();
        System.out.println("\n");
         
        MethodOverriding1 m=new MethodOverriding1();
        m.name="Shamim Hossain";
        m.age=27;
        m.Status="Overriding";
        m.Display1();
        
    }
}
