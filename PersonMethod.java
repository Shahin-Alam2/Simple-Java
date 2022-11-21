
package Bio;

public class PersonMethod {
    String name,gender;
    int phone;
    
    //parameterised method
    void setInformation(String n,String m,int p){ //prmtr
        name=n;
        gender=m;
        phone=p;
    }
    
    void Display(){
        
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
    }
    int square(int n){
        return n*n;
    }
}
