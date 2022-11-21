import java.util.Scanner;

public class Factorial {
   public static void main(String args[]){
       Scanner input=new Scanner(System.in);
       
       Fact ob=new Fact();
       int n,result;
       System.out.print("Number:");
       n=input.nextInt();
       result=ob.Fact(n);
       System.out.println("Factorial: "+result);
   } 
}
