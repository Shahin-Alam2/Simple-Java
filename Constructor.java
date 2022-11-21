
package Bio;

public class Constructor {
    public static void main(String args[]){
        
        PersonConstrctr Person1=new PersonConstrctr("A","B"); //2 ta parameter 2ta prmtr ala cnstrctr e jabe
        Person1.Display();
        
        PersonConstrctr Person2=new PersonConstrctr("Shahin Alam","Male",1729814876);
        Person2.Display();
       
        PersonConstrctr Person3=new PersonConstrctr();//null prmtr ala cnstrctr e jabe
    }
}
