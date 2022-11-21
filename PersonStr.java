
package Ep_100_Plus;

public class PersonStr {
    
    String name;
    int age;
    
    PersonStr(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
      return "Name: "+name +"\nAge: "+age;   
    }
}   

