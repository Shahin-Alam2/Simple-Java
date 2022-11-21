
import java.util.Scanner;

public class MathDemo {
  public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      int a,b;
      double d;
      
      System.out.println("Enter two integers:");
      a=input.nextInt();
      b=input.nextInt();
      System.out.println("Enter double number:");
      d=input.nextDouble();
      
      
      int max=Math.max(a,b);
      System.out.println("Maximum: "+max);
      
      int min=Math.min(a,b);
      System.out.println("Minimum: "+min);
      
      double abs=Math.abs(b);
      System.out.println("Absolute of b: "+abs);
      
      double pow=Math.pow(d,a);
      System.out.println("'a'th Power of 'd': "+pow);
      
      double round=Math.round(d);
      System.out.println("Value of d around : "+round);
      
      double p = Math.PI;
      System.out.println("Pi: "+p);
  }  
}
