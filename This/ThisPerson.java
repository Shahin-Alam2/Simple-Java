
package This;

public class ThisPerson {
    
    String name;
    int age;
    String hairColor;
    
    ThisPerson(String name,int age){
        this.name=name;
        this.age=age;
    }
    
    ThisPerson(String name,int age,String hairColor){
        this(name,age);
        this.hairColor=hairColor;
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Hair Color: "+hairColor);
    }
}
