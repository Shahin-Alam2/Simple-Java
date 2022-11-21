
package polymorphism;

public class Test {
    public static void main(String[] args){
    
 /*      Person p=new Person();
       Student s=new Student();
       Teacher t=new Teacher();
       
       p.display();
       s.display();
       t.display();   */
 
       Person p=new Person();
       p.display();
       
       p=new Student();
       p.display();
       
       p=new Teacher();
       p.display();
       
    }
}
