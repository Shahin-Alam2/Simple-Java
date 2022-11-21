
package Bio;

public class Method {
    public static void main(String args[]){
      
        //parameterised method
        PersonMethod Person1=new PersonMethod();
        Person1.setInformation("Shahin Alam","Male",1729814876); //prmtr
        Person1.Display();
        
        //general method
        PersonMethod Person2=new PersonMethod();
        Person2.name="X";
        Person2.gender="Male";
        Person2.phone=8342631;
        Person2.Display();
        
        PersonMethod ob1=new PersonMethod();
        System.out.println("Square of 12: "+ob1.square(12));
    }
}
