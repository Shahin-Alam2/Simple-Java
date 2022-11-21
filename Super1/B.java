
package Super1;

public class B extends A {
    int x=5;
    //String company;
    B(String name){
        //super() ei line ta prothome likhte hobe
        super(name); //constructor er khetre ei line na likhleo hobe //A constructor e parameter thakle super(paramtr)
        //System.out.println("B's Constructor.");
        //this.company = name;
    }
    
    void display(){
        super.display(); //ei line na likhle A class er display() method execute hobena
        //super.display();
        System.out.println("Inside B Class");
        System.out.println(x); //here x=5 
        
        System.out.print("Using Super Keyword in B Class,x=");
        System.out.println(super.x);
       // System.out.println("Company Name :"+ company);
    }
}
