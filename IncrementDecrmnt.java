
package Practice;

import java.util.Scanner;

public class IncrementDecrmnt {
public static void main(String args[]){
    
    Scanner input=new Scanner(System.in);
    int a,b;
    
    System.out.print("Enter a number:");
    a=input.nextInt();
    System.out.println("a="+a);
    //Increment
    System.out.println("Increment");
    b=a++;
    System.out.println("b=a++ ,  b="+b);
    System.out.println("a="+a);
    b=++a;
    System.out.println("b=++a ,  b="+b);
    System.out.println("a="+a);
    //Decrement
    System.out.println("Decrement");
    b=a--;
    System.out.println("b=a-- ,  b="+b);
    System.out.println("a="+a);
    b=--a;
    System.out.println("b=--a ,  b="+b);
    System.out.println("a="+a);
    }    
}
