
package AugustMonth;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        
        int a,b,c;
        String name;
        
        System.out.println("Whats your name?");
        name=input.next();
        System.out.println("Hi, "+name+".Enter two integer to add:");
        
        a=input.nextInt();
        b=input.nextInt();
        c=a+b;
        System.out.println("Sum: "+c);
    }
}
