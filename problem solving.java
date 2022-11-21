package problemSolving;
import java.util.Scanner;

public class First {
   public static void main(String args[]){
    
    int a,b,c;
    
    while(true){
    try{
     Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    a=input.nextInt();
    System.out.println("Enter another number:");
    b=input.nextInt();
    c=a/b;
    System.out.println("Result: "+a +"/"+""+b+"="+c);
     }catch(Exception e){
         
       System.out.println("Exception: "+e);  
       System.out.println("You must enter an integer number.");
     }
    }
   }
}
