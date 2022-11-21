
package Bio;

public class PersonConstrctr {
    String name,gender;
    int phone;
    
    //Constructor er Name class er name e hobe
    //er kono Return type nai
    PersonConstrctr(String n,String m,int p){
        name=n;
        gender=m;
        phone=p;
    }
    PersonConstrctr(String n,String m){
        name=n;
        gender=m;
    }
    PersonConstrctr(){
        System.out.println("No Information");
    }
    
   void Display(){
   
       System.out.println("Name:"+name);
       System.out.println("Gender:"+gender);
       System.out.println("Phone:"+phone);
   }
       
}
